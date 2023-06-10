package CodigoFuente;

public class UsuarioTurista extends Usuario {
    
// Declaracion de atributos de la clase UsuarioTurista

  public Int idUsuarioTurist;
  public Int carritoCompra;

// Creacion de constructor 

  public UsuarioTurista(String nombre, String apellido, String contraseña, String email, String telefono, Int idUsuarioTurist, Int carritoCompra) {
    super(nombre, apellido, contraseña, email, telefono);
    this.idUsuarioTurist = idUsuarioTurist;
    this.carritoCompra = carritoCompra;
  }
  
//Creacion de getters y setters 
  
  public Int getIdUsuarioTurist() {
    return idUsuarioTurist;
  }
  public void setIdUsuarioTurist(Int idUsuarioTurist) {
    this.idUsuarioTurist = idUsuarioTurist;
  }
  public Int getCarritoCompra() {
    return carritoCompra;
  }
  public void setCarritoCompra(Int carritoCompra) {
    this.carritoCompra = carritoCompra;
  }


// Declaracion de metodos de la clase UsuarioTurista 

  public void consultarSitios() {
    System.out.println("Aqui puedes consultar sitios");
  }
  public void historialCompras() {
    System.out.println("Aqui puedes consultar tu historial de compras");
  }
  public void realizarPago() {
    System.out.println("Por favor realiza el pago");
  }
  public void calificar() {
    System.out.println("Por favor califica nuestro servicio o producto");
  }

}
