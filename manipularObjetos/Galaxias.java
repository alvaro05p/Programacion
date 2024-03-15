import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Galaxias{

    public static void main(String[] args) {
    
        try {

            String[] partes;

            File sac = new File("SAC.bin");

            FileReader lector = new FileReader("SAC_DeepSky_Ver81_QCQ.TXT");
            
            BufferedReader bufer = new BufferedReader(lector);

            String linea;
            
            while((linea = bufer.readLine()) != null){
                
                partes = linea.split(",");


                Galaxia galaxy = new Galaxia(partes[0],partes[3],partes[4],partes[5],partes[6]);

                if (partes[2].equals("\"GALXY\"")){

                    FileOutputStream escritor = new FileOutputStream(sac,true);
                    ObjectOutputStream escritor2 = new ObjectOutputStream(escritor);
                
                    escritor2.writeObject(galaxy);
                    System.out.println(galaxy);
                    escritor.close();
                    escritor2.close();
                
                }
            }

        } catch (IOException e) {
            
            System.out.println("Error al leer el fichero");
            
        } 
        
        

        

    
    }

}

