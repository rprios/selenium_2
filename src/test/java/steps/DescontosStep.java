package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DescontosStep {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site da Qazando$")
    public void acessar_site_qazando() {
        driver.get("https://qazando.com.br/curso.html");
        //System.out.println("passou1");
    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() {
        driver.findElement(By.id("#email"));
        //System.out.println("passou2");
        //#email
    }

    @Quando("^clico no ganhar cupom$")
    public void clico_no_ganhar_cupom() {
        //System.out.println("passou3");
    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        //System.out.println("passou4");
    }



}


