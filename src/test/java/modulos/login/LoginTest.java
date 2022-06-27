package modulos.login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.LoginPage;
import java.time.Duration;

@DisplayName("Testes web do módulo de login")
public class LoginTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome Driver 103.0.5060.53\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        navegador.get("https://www.saucedemo.com/");
    }

    @Test
    @DisplayName("Validando logon, adicao de item no carrinho e logoff")
    public void testUsuarioLogado() {

        new LoginPage(navegador)
                .informarOUsuario("standard_user")
                .informarASenha("secret_sauce")
                .submeterLogin()
                .validarLogin()
                .adicionarItemAoCarrinho()
                .validarProdutoAdicionadoAoCarrinho()
                .submeterLogoff()
                .submeterPaginaPrivada()
                .validarLogoff();

    }

    @AfterEach
    public void afterEach() {
        navegador.quit();
    }
}