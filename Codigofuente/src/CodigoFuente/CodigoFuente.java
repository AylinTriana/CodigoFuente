package CodigoFuente;
import java.util.Scanner;

public class CodigoFuente {
 public static void main(String[] args) {

//Creación de objeto
    
    Usuario usuario = new Usuario ("Daniel", "Ruiz", "158746", "danielruiz@gmail.com", "3005689564" );
    System.out.println("el id del usuario es: " + usuario.getid());
    System.out.println("el nombre del usuario es: " + usuario.getnombre());
    System.out.println("el apellido del usuario es: " + usuario.getapellido());
    System.out.println("la contraseña del usuario es: " + usuario.getcontraseña());
    System.out.println("el email del usuario es: " + usuario.getemail());
    System.out.println("el telefono del usuario es: " + usuario.gettelefono());

//Cambio de dato con el settter

    System.out.println("----------------------------------");
    usuario.setapellido("Triana");
    System.out.println("el id del usuario es: " + usuario.getid());
    System.out.println("el nombre del usuario es: " + usuario.getnombre());
    System.out.println("el apellido del usuario es: " + usuario.getapellido());
    System.out.println("la contraseña del usuario es: " + usuario.getcontraseña());
    System.out.println("el email del usuario es: " + usuario.getemail());
    System.out.println("el telefono del usuario es: " + usuario.gettelefono());

    Scanner teclado = new Scanner (System.in);
    int opcion = 0;
    Boolean iniciarSesion = false;
    while(opcion != 10){
    System.out.println("----------------------------------");
    System.out.println("Por favor escoja una opción");
    System.out.println("---------------------------");
    System.out.println("1: iniciar sesion");
    System.out.println("2: actualizar usuario");
    System.out.println("3: registrar usuario");
    System.out.println("10: salir");
    opcion = teclado.nextInt();

    if(iniciarSesion != true && opcion != 1){
        System.out.println("aun no ha iniciado sesion");
    }
    if (opcion == 1){
        System.out.println(usuario.iniciarSesion());
        iniciarSesion = usuario.iniciarSesion();
        
        
    }   

    }
}
}



