import java.util.List;
import java.util.ArrayList;
public class Cliente {

    private String DNI, Nombre, Apellido, Direccion, Telefono;
    private List<Reserva> reservaList;

    public Cliente(String DNI, String nombre, String apellido, String direccion, String telefono) {
        this.DNI = DNI;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Direccion = direccion;
        this.Telefono = telefono;
        this.reservaList = new ArrayList<>();
    }

    public void  addReserva (Reserva reserva){
        reservaList.add(reserva);
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", reservaList=" + reservaList +
                '}';
    }
}
