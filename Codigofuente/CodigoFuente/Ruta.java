package CodigoFuente;

public class Ruta {
    
 //atributos 
    public int idRuta;
    public String nombreRuta;
    public String SitioTuristicoIncluidos;
    public String descripcionRuta;
    public Float longitud;

    // asignacion de metodos

    public void agregarRuta(){
    }
    public void editarRuta(){
    }
     public void verRuta(){
    }
     public void eliminarRuta(){
    }

    //GET Y SET 
    
    public int getIdRuta() {
        return idRuta;
    }
    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
    public String getNombreRuta() {
        return nombreRuta;
    }
    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }
    public String getSitioTuristicoIncluidos() {
        return SitioTuristicoIncluidos;
    }
    public void setSitioTuristicoIncluidos(String sitioTuristicoIncluidos) {
        SitioTuristicoIncluidos = sitioTuristicoIncluidos;
    }
    public String getDescripcionRuta() {
        return descripcionRuta;
    }
    public void setDescripcionRuta(String descripcionRuta) {
        this.descripcionRuta = descripcionRuta;
    }
    public Float getLongitud() {
        return longitud;
    }
    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }
    
    //Constructor

    public Ruta(int idRuta, String nombreRuta, String sitioTuristicoIncluidos, String descripcionRuta, Float longitud) {
        this.idRuta = idRuta;
        this.nombreRuta = nombreRuta;
        SitioTuristicoIncluidos = sitioTuristicoIncluidos;
        this.descripcionRuta = descripcionRuta;
        this.longitud = longitud;
    }


    
    


}
