package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;


public class DescontosStep {
    @Dado("^que estou no site da Qazando$")
    public void acessar_site_qazando() {
        System.out.println("passou1");
    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() {
        System.out.println("passou2");
    }

    @Quando("^clico no ganhar cupom$")
    public void clico_no_ganhar_cupom() {
        System.out.println("passou3");
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        System.out.println("passou4");
    }



}


