package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutosPage {
    private WebDriver navegador;
    public ProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ProdutosPage validarLogin () {
        String PaginaProduto = navegador.findElement(By.className("title")).getText();
        Assertions.assertEquals("PRODUCTS", PaginaProduto);
        return this;
    }

    public ProdutosPage adicionarItemAoCarrinho () {
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        return this;
    }

    public ProdutosPage validarProdutoAdicionadoAoCarrinho () {
        String QuantidadeDeItensNoCarrinho = navegador.findElement(By.id("shopping_cart_container")).getText();
        Assertions.assertEquals("1", QuantidadeDeItensNoCarrinho);
        return this;
    }

    public LoginPage submeterLogoff () {
        navegador.findElement(By.id("react-burger-menu-btn")).click();
        navegador.findElement(By.cssSelector(".bm-item-list [id='logout_sidebar_link'")).click();
        return new LoginPage(navegador);
    }

}
