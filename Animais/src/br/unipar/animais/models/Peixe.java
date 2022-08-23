package br.unipar.animais.models;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super();
        super.setNumPatas(0);
        super.setAmbiente("Mar");
        super.setCor("Cinza");
        setCaracteristicas("Barbatanas e Cauda");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Peixe{" + "caracteristicas=" + caracteristicas + '}'
                + super.toString();
    }
}
