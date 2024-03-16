package Astronomia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Galaxias{

    public static void main(String[] args) {
    
        try {

            String[] partes;

            //El fichero que se va a crear

            File sac = new File("SAC.bin");

            //Leer archivos de texto

            FileReader lector = new FileReader("Astronomia/SAC_DeepSky_Ver81_QCQ.TXT");
            
            BufferedReader bufer = new BufferedReader(lector);

            //Para escribir en el archivo binario
            
            FileOutputStream escritor = new FileOutputStream(sac,true);
            
            ObjectOutputStream escritor2 = new ObjectOutputStream(escritor);

            String linea;

            //Lee linea por linea hasta que haya una linea vacia
            
            while((linea = bufer.readLine()) != null){
                
                //Separa por comas el fichero

                partes = linea.split(",");

                //Cuando el 3er campo separado por comas sea GALXY creamos un objeto
                //con las partes que nos interesan del fichero

                if (partes[2].equals("\"GALXY\"")){

                    Galaxia galaxy = new Galaxia(partes[0],partes[3],partes[4],partes[5],partes[6]);

                    //escritor 2 es el que escribe en binario

                    escritor2.writeObject(galaxy);
                    
                
                }
            }

            escritor.close();
            escritor2.close();
            bufer.close();
            lector.close();


        } catch (IOException e) {
            
            System.out.println("Error relacionado con los ficheros");

        } 
        
        

        

    
    }

}

