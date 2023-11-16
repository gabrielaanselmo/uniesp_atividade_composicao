public class Cargo {
    private String nomeCargo;
    private double salarioBase;

    public Cargo(String nomeCargo, double salarioBase) {
        this.nomeCargo = nomeCargo;
        this.salarioBase = salarioBase;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
