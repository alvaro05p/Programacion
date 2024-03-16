package PrimeraTarea;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Comprobador {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Usuario:");
            String usuario = sc.next();
            
            boolean usuExiste = false;
            boolean passExiste = false;


            BufferedReader comprobador = new BufferedReader(new FileReader("archivo.txt")); 
            String linea;
            
            while((linea = comprobador.readLine()) != null){
            
                String[] partes = linea.split(":");

                String parteU = partes[0];
                String parteC = partes[1];

                if (parteU.equals(usuario)){

                    usuExiste=true;
                
                    if(usuExiste){
                        System.out.println("Usuario valido, introduce la contraseña: ");

                        String pass = sc.next();

                        if(parteC.equals(pass)){

                            System.out.println("Contraseña correcta");

                        }else{

                            System.out.println("Incorrecta");

                        }
                        
                    }

                }
            }
            
            if (!usuExiste){
                    
                System.out.println("No se ha podido encontrar el usuario");
            
            }
            
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }
    }
}
