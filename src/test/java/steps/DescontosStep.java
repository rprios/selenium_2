package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DescontosStep {

    WebDriver driver = new ChromeDriver();
    //Actions actions = new Actions(driver);



    @Dado("^que estou no site da Qazando$")
    public void acessar_site_qazando() {
        driver.get("https://qazando.com.br/curso.html");
        Assert.assertEquals("ERRO NÃO FUNCIONOU", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
        driver.manage().window().maximize();
        System.out.println("passou1");
    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("!window.scrollTo(0, 10000)");
        Thread.sleep(5000);

        driver.findElement(By.id("email")).sendKeys("teste@teste.com");
        driver.findElement(By.id("email")).sendKeys("\t");
        System.out.println("passou2");
        //#email
    }

    @Quando("^clico no ganhar cupom$")
    public void clico_no_ganhar_cupom() throws InterruptedException {
        //Actions.moveToElement(driver.findElement(By.id("button"))).perform();
        driver.findElement(By.id("button")).click();
        System.out.println("passou3");
    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_cupom);
        System.out.println("passou4");
        Assert.assertEquals("O cupom está errado", "QAZANDO15OFF", texto_cupom);
        driver.quit();
    }



}


