import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Galaxias{

    public static void main(String[] args) {
    
        try {

            String[] partes;

            

            FileReader lector = new FileReader("SAC_DeepSky_Ver81_QCQ.TXT");
            
            BufferedReader bufer = new BufferedReader(lector);

            String linea;
            
            while((linea = bufer.readLine()) != null){
                
                partes = linea.split(",");


                Galaxia galaxy = new Galaxia(partes[0],partes[3],partes[4],partes[5],partes[6]);

                
                System.out.println(galaxy);
                

            }

        } catch (Exception e) {
            
            System.out.println("Error al leer el fichero");
            
        }
        
        

        

    
    }

}

