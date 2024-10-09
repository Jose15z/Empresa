package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private int salarioPorHora;
    public EmpleadoPorHora(String nombre, String id, int horasTrabajadas, int salarioPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }
    public int calcularSalario(){
        int salario = horasTrabajadas * salarioPorHora;
        return salario;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getSalarioPorHora() {
        return salarioPorHora;
    }
    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

   
    
}
