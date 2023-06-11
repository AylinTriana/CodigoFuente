package CodigoFuente;

import java.sql.Blob;



public class SitioTuristico {


    //atributos 
    public int idSitio;
    public String nombreSitio;
    public String tipoSitio;
    public String ruta;
    public String direccionSitio;
    public String ubicacionGeo;
    public String descripcionSitio;
    public Blob imagenesSitio;
    public String servicioSitio;
    public Int precioSitio;
    public Boolean disponibilidadSitio;

// asignacion de metodos

    public void agregarServicioTuristico(){
    }
    public void editarServicioTuristico(){
    }
    public void verServicioTuristico(){
    }
    public void EliminarServicioTuristico(){
    }

//get y set 

    public int getIdSitio() {
        return idSitio;
    }
    public void setIdSitio(int idSitio) {
        this.idSitio = idSitio;
    }
    public String getNombreSitio() {
        return nombreSitio;
    }
    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public String getDireccionSitio() {
        return direccionSitio;
    }
    public void setDireccionSitio(String direccionSitio) {
        this.direccionSitio = direccionSitio;
    }
    public String getUbicacionGeo() {
        return ubicacionGeo;
    }
    public void setUbicacionGeo(String ubicacionGeo) {
        this.ubicacionGeo = ubicacionGeo;
    }
    public String getDescripcionSitio() {
        return descripcionSitio;
    }
    public void setDescripcionSitio(String descripcionSitio) {
        this.descripcionSitio = descripcionSitio;
    }
    public Blob getImagenesSitio() {
        return imagenesSitio;
    }
    public void setImagenesSitio(Blob imagenesSitio) {
        this.imagenesSitio = imagenesSitio;
    }
    public String getServicioSitio() {
        return servicioSitio;
    }
    public void setServicioSitio(String servicioSitio) {
        this.servicioSitio = servicioSitio;
    }
    public Int getPrecioSitio() {
        return precioSitio;
    }
    public void setPrecioSitio(Int precioSitio) {
        this.precioSitio = precioSitio;
    }
    public Boolean getDisponibilidadSitio() {
        return disponibilidadSitio;
    }
    public void setDisponibilidadSitio(Boolean disponibilidadSitio) {
        this.disponibilidadSitio = disponibilidadSitio;
    }

    //constructor

    public SitioTuristico(int idSitio, String nombreSitio, String ruta, String direccionSitio, String ubicacionGeo,
            String descripcionSitio, Blob imagenesSitio, String servicioSitio, Int precioSitio,
            Boolean disponibilidadSitio) {
        this.idSitio = idSitio;
        this.nombreSitio = nombreSitio;
        this.ruta = ruta;
        this.direccionSitio = direccionSitio;
        this.ubicacionGeo = ubicacionGeo;
        this.descripcionSitio = descripcionSitio;
        this.imagenesSitio = imagenesSitio;
        this.servicioSitio = servicioSitio;
        this.precioSitio = precioSitio;
        this.disponibilidadSitio = disponibilidadSitio;
    }


    
}
