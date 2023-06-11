package CodigoFuente;

import java.util.Date;

public class Compra {
    
// Asignacion de atributos
   
   public Int idCompra;
   public Date fechaCompra;

// Declaracion de metodos de la clase Compra 

    public void verDetalles(){
    }
    public void agregarServicio(){
    }
    public void agregarProducto(){
    }
    public void eliminarProducto(){
    }
    public void eliminarServicio(){
    }
    public void abandonarCompra(){
    }
    public void realizarPago(){
    }
    public void confirmacionDePago(){
    }

    //get y set 

    public Int getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(Int idCompra) {
        this.idCompra = idCompra;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    //cosntructor
    
    public Compra(Int idCompra, Date fechaCompra) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
    }

  

    
}