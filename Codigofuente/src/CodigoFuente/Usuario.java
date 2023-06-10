package CodigoFuente;

public class Usuario {
    
// Declaracion de atributos de la clase Usuario 

    public Int id;
    public String nombre;
    public String apellido;
    public String contraseña;
    public String email;
    public String telefono;

// Creacion de constructor 

    public Usuario(String nombre, String apellido, String contraseña, String email, String telefono){
    this.nombre = nombre;
    this.apellido = apellido;
    this.contraseña = contraseña;
    this.email = email;
    this.telefono = telefono; 
}

//Creacion de getters y setters 

    public Int getid() {
        return id;
    }

    public void setid(Int id){
        this.id = id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

      public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

      public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña){
        this.contraseña = contraseña;
    }

      public String getemail() {
        return email;
    }

    public void setemail(String email){
        this.email = email;
    }

      public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono){
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

