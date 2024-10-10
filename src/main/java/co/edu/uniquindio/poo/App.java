package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("constructora");
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Jose", "1092852697", 100);
        empresa.empleados.add(empleadoFreelance);
        empresa.mostrarEmpleados();
    }
}
