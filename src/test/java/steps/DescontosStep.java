package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTeste;


public class DescontosStep extends RunCucumberTeste {


    //Actions actions = new Actions(driver);
    HomePage HomePage  = new HomePage(driver);



    @Dado("^que estou no site da Qazando$")
    public void acessar_site_qazando() throws InterruptedException {
        HomePage.acessarAplicacao();
        HomePage.scrollDown();

    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() throws InterruptedException {
        HomePage.preencheEmail();
        //System.out.println("passou2");
        //#email
    }

    @Quando("^clico no ganhar cupom$")
    public void clico_no_ganhar_cupom() throws InterruptedException {
        //Actions.moveToElement(driver.findElement(By.id("button"))).perform();
        HomePage.cliqueGanharDesconto();

    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        HomePage.verificarCupomDesconto();
    }

    @Dado("^que tenho cupom gerado$")
    public void queTenhoCupomGerado() throws InterruptedException {
        HomePage.acessarAplicacao();
        HomePage.scrollDown();
        HomePage.preencheEmail();
        HomePage.cliqueGanharDesconto();
        HomePage.verificarCupomDesconto();
    }



}


