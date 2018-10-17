package Vehiculos;

public class Utilitario extends Vehiculo {

    private String Caja;

    public Utilitario(String modelo, String marca, String matricula, String caja) {
        super(modelo, marca, matricula);
        setCaja(caja);
    }

    public String getCaja() {
        return Caja;
    }

    public void setCaja(String caja) {
        Caja = caja;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "Caja='" + Caja + '\'' +
                '}';
    }
}