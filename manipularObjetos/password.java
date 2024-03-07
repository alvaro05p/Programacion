import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario:");
        String usuario = sc.next();
        System.out.println("Contraseña");
        String pass = sc.next();

        try{
            FileWriter password = new FileWriter("archivo.txt", true);
            password.write("<"+usuario+">"+":"+"<"+pass+">\n");
            System.out.println("Contenido escrito correctamente"); 
            password.close();       
        } catch (IOException e) {
            System.out.println("Contenido no se pudo escribir");
        }

    }
    
}