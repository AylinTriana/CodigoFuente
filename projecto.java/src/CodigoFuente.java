import java.util.Scanner;

public class CodigoFuente {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int opcion = 0;
        Boolean iniciarSesion = false;
        while(opcion != 10){
        System.out.println("1: iniciar sesion");
        System.out.println("2: actualizar usuario");
        System.out.println("3: registrar usuario");
        System.out.println("10: salir");
        opcion = teclado.nextInt();
        if(iniciarSesion != true && opcion != 1){
            System.out.println("aun no ha iniciado sesion");
        }
        if (opcion == 1){
            Usuario usuario = new Usuario ("Daniel", "Ruiz", "158746", "danielruiz@gmail.com", "3005689564" );
            System.out.println(usuario.iniciarSesion());
            iniciarSesion = usuario.iniciarSesion();
        }
        if(opcion == 2 && iniciarSesion == true)
        
    }
    
}
}



