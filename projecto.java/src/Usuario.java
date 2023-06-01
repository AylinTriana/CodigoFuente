public class Usuario {
    
// Asigancion de atributos
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

// asignacion de metodos

    public Int registrarse() {
        return id; 
    }
    public boolean iniciarSesion() {
        return true;
    }
    public void actualizarUsuario(){
    }

} 

