package br.unipar.animais;

import br.unipar.animais.models.Mamifero;
import br.unipar.animais.models.Peixe;

/**
 *
 * @author bruno
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("ZOO:\n------------------------");
        Mamifero camelo = new Mamifero();
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2.0);
        camelo.setNome("Camelo");
        System.out.println("Animal: " + camelo.getNome() + "\nComprimento: "
                + camelo.getComprimento() + "\nPatas: " + camelo.getNumPatas() + "\nCor: "
                + camelo.getCor() + "\nAmbiente: " + camelo.getAmbiente()
                + "\nVelocidade: " + camelo.getVelocidade()+" m/s");

        System.out.println("------------------------");

        Peixe tubarao = new Peixe();
        tubarao.setComprimento(300);
        tubarao.setCor("Cinzento");
        tubarao.setNome("Tubarão");
        System.out.println("Animal: " + tubarao.getNome() + "\nComprimento: "
                + tubarao.getComprimento() + "\nPatas: " + tubarao.getNumPatas() + "\nCor: "
                + tubarao.getCor() + "\nAmbiente: " + tubarao.getAmbiente()
                + "\nVelocidade: " + tubarao.getVelocidade() + " m/s\nCaracterísticas: "
                + tubarao.getCaracteristicas());

        System.out.println("-------------------------");
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        urso.setAlimento("Mel");
        System.out.println("Animal: " + urso.getNome() + "\nComprimento: "
                + urso.getComprimento() + "\nPatas: " + urso.getNumPatas() + "\nCor: "
                + urso.getCor() + "\nAmbiente: " + urso.getAmbiente()
                + "\nVelocidade: " + urso.getVelocidade() + " m/s\nAlimento: "
                + urso.getAlimento());

    }

}
