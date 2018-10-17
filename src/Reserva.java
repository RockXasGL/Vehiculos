import Vehiculos.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private Integer ID;

    private List<Vehiculo> vehiculoList;

    private Agencia agencia;

    private LocalDate fechaInicio;

    public Reserva ()  {
        vehiculoList = new ArrayList<>();
        fechaInicio = LocalDate.of(2018, 10, 17);
    }
    public void  addVehiculoList (Vehiculo vehiculo){
        vehiculoList.add(vehiculo);
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "ID=" + ID +
                ", vehiculoList=" + vehiculoList +
                ", agencia=" + agencia +
                '}';
    }
}
