import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MenuGalaxias {
    public static void main(String[] args) {
        try {
            
            FileInputStream archivo = new FileInputStream("SAC.bin");
            ObjectInputStream lector = new ObjectInputStream(archivo);

            System.out.println("1.Nombre del objeto:");
            System.out.println("2.Constelación");
            System.out.println("3.Magnitud límite");
            System.out.println("4.Salir");
            System.out.println("");
            System.out.print("Elige una opcion: ");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    String buscarObjeto1 = sc.nextLine();
                    String buscarObjeto = " "+buscarObjeto1+" ";

                    try {

                        while (true) {
                            Object objeto = lector.readObject();
                            
                            if (objeto instanceof Galaxia){
        
                                Galaxia galaxia = (Galaxia) objeto;
                                
                                if(buscarObjeto.equals(galaxia.getOBJECT())){
                                    System.out.println("");
                                    System.out.println("Informacion del objeto:"+galaxia.galaxiaToString());

                                }

                                
                            }
                        }
        
                    } catch (ClassNotFoundException e) {
        
                        e.printStackTrace();
        
                    } catch (IOException e){
        
                        System.out.println("");
        
                    }
            
                    break;
                            
                    default:
                    break;
            }
            
            lector.close();

        } catch (IOException e) {

            e.printStackTrace();
            
        }
    }
}
