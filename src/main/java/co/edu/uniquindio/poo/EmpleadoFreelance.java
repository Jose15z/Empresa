package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class EmpleadoFreelance extends Empleado {
    private int proyectosCompletados;
    private int salarioPorProyecto;
    public Collection<Proyecto> proyectos;

    public EmpleadoFreelance(String nombre, String id, int salarioPorProyecto) {
        super(nombre, id);
        this.salarioPorProyecto = salarioPorProyecto;
        proyectos = new LinkedList<>();
    }
    public int calcularSalario(){
        int salario = proyectosCompletados * salarioPorProyecto;
        return salario;
    }
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public int getSalarioPorProyecto() {
        return salarioPorProyecto;
    }

    public void setSalarioPorProyecto(int salarioPorProyecto) {
        this.salarioPorProyecto = salarioPorProyecto;
    }

    public Collection<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(Collection<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

}
