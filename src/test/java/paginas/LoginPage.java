package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage informarOUsuario(String usuario) {
        navegador.findElement(By.id("user-name")).sendKeys(usuario);
        return this;
    }

    public LoginPage informarASenha(String senha) {
        navegador.findElement(By.id("password")).sendKeys(senha);
        return this;
    }

    public ProdutosPage submeterLogin(){
        navegador.findElement(By.id("login-button")).click();
        return new ProdutosPage(navegador);
    }

    public LoginPage submeterPaginaPrivada() {
        navegador.get("https://www.saucedemo.com/inventory.html");
        return this;
    }

    public LoginPage validarLogoff() {
        String LoggoffRealizado = navegador.findElement(By.cssSelector("div[class='error-message-container error'")).getText();
        Assertions.assertEquals("Epic sadface: You can only access '/inventory.html' when you are logged in.", LoggoffRealizado);
        return this;
    }
}
