package CodigoFuente;

public class Usuario {
    
// Declaracion de atributos de la clase Usuario 

    public Int id;
    public String nombre;
    public String apellido;
    public String contraseña;
    public String email;
    public Int telefono;

// Creacion de constructor 

    public Usuario(Int id, String nombre, String apellido, String contraseña, String email, Int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.email = email;
        this.telefono = telefono;
    }
    
//Creacion de getters y setters 


    public Int getId() {
        return id;
    }

    public void setId(Int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Int getTelefono() {
        return telefono;
    }

    public void setTelefono(Int telefono) {
        this.telefono = telefono;
    }


// Declaracion de metodos de la clase Usuario 

    public Int registrarPersona() {
        return id; 
    }
    public boolean iniciarSesion() {
        return true;
    }
    public void actualizarUsuario(){
        System.out.println("Por favor actualizar datos");
    }

    


    
      
} 

