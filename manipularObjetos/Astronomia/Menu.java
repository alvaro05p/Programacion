package Astronomia;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Menu {

    public static void main(String[] args) {    

        FileInputStream archivo = null;
        ObjectInputStream objetos = null;
        
        try{
            
            archivo = new FileInputStream("SAC.bin");
            objetos = new ObjectInputStream(archivo);
            
            //Leer el binario y sus objetos
        
            while (true) {
            
                    Object objeto = objetos.readObject();

                    System.out.println(objeto);
            }

        } catch (ClassNotFoundException e) {
                    
            System.out.println("Clase no encontrada: " + e.getMessage());
                
        } catch (IOException e) {

            System.out.println("Archivo leido");

        }
    }
}
