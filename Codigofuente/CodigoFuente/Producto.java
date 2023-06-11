package CodigoFuente;

public class Producto {
    
// Asignacion de atributos
   
   public String nombre;
   public String descripcion;
   public String precios;
   public String disponibilidad; 

// asignacion de metodos

    public void verDisponibilidad(){
    }
    public void reservar(){
    }
    public void cancelar(){
    }

//get y set

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
    public String getPrecios() {
        return precios;
    }
    public void setPrecios(String precios) {
        this.precios = precios;
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    
}