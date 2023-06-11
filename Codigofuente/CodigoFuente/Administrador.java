package CodigoFuente;

public class Administrador extends Usuario{

// Declaracion de atributos de la clase Administrador

   public Int idUsuarioAdmin;
   public String gestionUsuario;
   public String gestionRuta;
   public String gestionSitio;

// creacion de metodos

 public void crearUsuario(){
    }
 public void verUsuario(){
    }
 public void eliminarUsuario(){
    }
 public void crearRuta(){
    }
 public void eliminarRuta(){
    }
 public void actualizarRuta(){
    }   
 public void crearSitio(){
    }
 public void verSitio(){
    }
 public void EliminarSitio(){
    }
 public void actualizarSitio(){
    }

//getter y set  

public Int getIdUsuarioAdmin() {
   return idUsuarioAdmin;
}
public void setIdUsuarioAdmin(Int idUsuarioAdmin) {
   this.idUsuarioAdmin = idUsuarioAdmin;
}
public String getGestionUsuario() {
   return gestionUsuario;
}
public void setGestionUsuario(String gestionUsuario) {
   this.gestionUsuario = gestionUsuario;
}
public String getGestionRuta() {
   return gestionRuta;
}
public void setGestionRuta(String gestionRuta) {
   this.gestionRuta = gestionRuta;
}
public String getGestionSitio() {
   return gestionSitio;
}
public void setGestionSitio(String gestionSitio) {
   this.gestionSitio = gestionSitio;
}

 // constructor

public Administrador(Int id, String nombre, String apellido, String contraseña, String email, Int telefono,
      Int idUsuarioAdmin, String gestionUsuario, String gestionRuta, String gestionSitio) {
   super(id, nombre, apellido, contraseña, email, telefono);
   this.idUsuarioAdmin = idUsuarioAdmin;
   this.gestionUsuario = gestionUsuario;
   this.gestionRuta = gestionRuta;
   this.gestionSitio = gestionSitio;
}

 
  
}