import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Galaxias {
    public static void main(String[] args) {

            String original = "SAC_DeepSky_Ver81_QCQ.TXT";
            String sinEspacios = "formateado.txt";

            try {
                BufferedReader lector = new BufferedReader(new FileReader(original));
                
                
                String linea;

                while((linea = lector.readLine()) != null){
                    //Formateamos
                    linea = linea.replaceAll("\"","");
                    linea = linea.replaceAll("\\s+"," ");
                    String[] partes = linea.split(",");
                    String tipo = partes[2];
                    //Si el tipo es GALXY creamos el objeto
                    if (tipo.equals("GALXY")){
                        Galaxia galaxia = new Galaxia(partes[0],partes[3],partes[4],partes[5],partes[6]);
                        System.out.println(galaxia.galaxiaToString());
                        //Serializamos el objeto
                        try {
                            FileOutputStream fichero = new FileOutputStream("SAC.bin");
                            ObjectOutputStream objeto = new ObjectOutputStream(fichero);

                            objeto.writeObject(galaxia);
                            objeto.close();
                            fichero.close();

                        } catch (IOException e) {
                            // TODO: handle exception
                        }
                    }
                }

                lector.close();



            } catch (IOException e) {
                // TODO: handle exception
            }

            


            
    }
}
