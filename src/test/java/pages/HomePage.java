package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://qazando.com.br/curso.html");
        Assert.assertEquals("ERRO NÃO FUNCIONOU", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
        driver.manage().window().maximize();
        System.out.println("passou1");

    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("!window.scrollTo(0, 10000)");
        Thread.sleep(5000);
    }

    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("teste@teste.com");
        driver.findElement(By.id("email")).sendKeys("\t");
    }

    public void cliqueGanharDesconto(){
        driver.findElement(By.id("button")).getText();
        driver.findElement(By.id("button")).click();
        //System.out.println("passou3");
    }

    public void verificarCupomDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_cupom);
        System.out.println("passou4");
        Assert.assertEquals("O cupom está errado", "QAZANDO15OFF", texto_cupom);

    }
}
