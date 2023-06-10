package CodigoFuente;

public class OperadorTuristico {

// Declaracion de atributos de la clase OperadorTuristico 

    public Int IdUsuarioOperador;

// Creacion de constructor 

    public OperadorTuristico(Int idUsuarioOperador) {
    this.IdUsuarioOperador = idUsuarioOperador;

//Creacion de getters y setters 

   
    }
    public Int getIdUsuarioOperador() {
        return IdUsuarioOperador;
    }
    public void setIdUsuarioOperador(Int idUsuarioOperador) {
        IdUsuarioOperador = idUsuarioOperador;
    }


// Declaracion de metodos de la clase OperadorTuristico

    public void AgregarServicioProducto(){
        System.out.println("Agrega el servicio o producto");
    }
    public void EditarServicioProducto(){
        System.out.println("Edita el servicio o producto");
    }
    public void ReporteCompras(){
        System.out.println("Reporta compra");
    }
    public void ServicioPorductAgregados(){
        System.out.println("Servicio o producto agragado satisfactoriamente");
    }
   

}