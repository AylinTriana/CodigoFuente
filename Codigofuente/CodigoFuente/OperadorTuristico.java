package CodigoFuente;

public class OperadorTuristico extends Usuario {

// Declaracion de atributos de la clase OperadorTuristico 

    public Int IdUsuarioOperador;

// Creacion de constructor 

public OperadorTuristico(Int id, String nombre, String apellido, String contraseña, String email, Int telefono,
            Int idUsuarioOperador) {
        super(id, nombre, apellido, contraseña, email, telefono);
        IdUsuarioOperador = idUsuarioOperador;
    }

//Creacion de getters y setters 

   
    
    public Int getIdUsuarioOperador() {
        return IdUsuarioOperador;
    }
    public void setIdUsuarioOperador(Int idUsuarioOperador) {
        IdUsuarioOperador = idUsuarioOperador;
    }


// Declaracion de metodos de la clase OperadorTuristico

    public void agregarServicioProducto(){
        System.out.println("Agrega el servicio o producto");
    }
    public void editarServicioProducto(){
        System.out.println("Edita el servicio o producto");
    }
    public void reporteCompras(){
        System.out.println("Reporta compra");
    }
    public void serviciosPorductAgregados(){
        System.out.println("Servicio o producto agragado satisfactoriamente");
    }
    
   




}