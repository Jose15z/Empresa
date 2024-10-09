package co.edu.uniquindio.poo;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private boolean estadoCompletado;
    public Proyecto(String nombre, String descripcion, boolean estadoCompletado){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estadoCompletado = estadoCompletado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isEstadoCompletado() {
        return estadoCompletado;
    }
    public void setEstadoCompletado(boolean estadoCompletado) {
        this.estadoCompletado = estadoCompletado;
    }
    
}
