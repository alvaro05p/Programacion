import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class comprobador {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Usuario:");
            String usuario = sc.next();
            System.out.println("Contraseña");
            String pass = sc.next();
            boolean existe = false;


            BufferedReader comprobador = new BufferedReader(new FileReader("archivo.txt")); 
            String linea;
            while((linea = comprobador.readLine()) != null){
                if (linea.equals("<"+usuario+">"+":"+"<"+pass+">")){
                    existe=true;
                }

                
            }
            if(existe){
                System.out.println("Usuario y contraseña validos");
            }else{
                System.out.println("No se ha podido encontrar el usuario o contraseña");
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }
    }
}
