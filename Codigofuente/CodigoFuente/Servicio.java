package CodigoFuente;

public class Servicio {

// Asignacion de atributos
   
   public String nombre;
   public String tipoDeServicio;
   public String descripcion;
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
    public String getTipoDeServicio() {
        return tipoDeServicio;
    }
    public void setTipoDeServicio(String tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    //constructor 
    
    public Servicio(String nombre, String tipoDeServicio, String descripcion, String disponibilidad) {
        this.nombre = nombre;
        this.tipoDeServicio = tipoDeServicio;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    

    
}

