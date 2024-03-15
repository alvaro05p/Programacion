import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir {
    public static void main(String[] args) {
        
        
            Scanner sc = new Scanner(System.in);
            
            
            
    
            try{
                FileWriter texto = new FileWriter("escribe.txt", true);
                
                boolean sigue = true;

                System.out.println("Teclea <-exit> para salir");

                while(sigue){

                    String escribe = sc.next();

                    if(escribe.equals("-exit")){
                        texto.close();
                        System.out.println("Contenido escrito correctamente");
                        sigue=false;
                    }else{
                        texto.write(escribe+"\n");
                        
                    }
                }
                    
                texto.close();
            } catch (IOException e) {
                System.out.println("Contenido no se pudo escribir");
            }
    
        }
        

}

