package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;
public class Empresa {
    private String nombre;
    public Collection<Empleado> empleados;
    private Collection<Proyecto> proyectos;
    public Empresa(String nombre){
        this.nombre = nombre;
        empleados = new LinkedList<>();
    }

    public void mostrarEmpleados(){
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Collection<Proyecto> getProyectos() {
        return proyectos;
    }
    public void setProyectos(Collection<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
   

    
    
}
