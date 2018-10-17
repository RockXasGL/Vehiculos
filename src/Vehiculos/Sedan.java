package Vehiculos;

public class Sedan extends Vehiculo {

    private String Baul;

    public Sedan(String modelo, String marca, String matricula,String baul) {
        super(modelo, marca, matricula);
        setBaul(baul);
    }

    public String getBaul() {
        return Baul;
    }

    public void setBaul(String baul) {
        Baul = baul;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "Baul='" + Baul + '\'' +
                '}';
    }
}
