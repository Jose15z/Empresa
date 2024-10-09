package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado {
    private int salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String id, int salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    

}
