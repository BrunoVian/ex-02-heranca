
package br.unipar.animais.models;

/**
 *
 * @author bruno
 */
public class Mamifero extends Animal {
    private String alimento;
    
    public Mamifero(){
        super();
        super.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "alimento=" + alimento + '}' + super.toString();
    }
    
    
}
