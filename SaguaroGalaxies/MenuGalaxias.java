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

                //El usuario introduce el nombre del objeto y le devolvemos todos los datos de este

                case 1:
                    System.out.println("Objeto a buscar: ");
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

                    //Mostraremos solo los objetos de la constelacion que introduzca el usuario

                    case 2:
                    System.out.println("Nombre de la galaxia: ");
                    String buscarConst1 = sc.nextLine();
                    String buscarConst = " "+buscarConst1+" ";

                    try {

                        while (true) {
                            Object objeto = lector.readObject();
                            
                            if (objeto instanceof Galaxia){
        
                                Galaxia galaxia = (Galaxia) objeto;
                               
                                if(buscarConst.equals(galaxia.getCON())){
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

                    case 3:
                    System.out.println("Magnitud limite: ");
                    String magLimite1 = sc.nextLine();
                    String maglimite = " "+magLimite1+" ";
                    Double magNum = Double.parseDouble(maglimite);
                    
                    try {

                        while (true) {
                            Object objeto = lector.readObject();
                            
                            if (objeto instanceof Galaxia){
        
                                Galaxia galaxia = (Galaxia) objeto;

                                if(galaxia.getMAG() <= magNum){
                                    
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

                    //Buscaremos objetos que tengan una magnitud limite inferior o igual a la introducida por el usuario

                
                            
                    default:
                    break;
            }
            
            lector.close();

        } catch (IOException e) {

            e.printStackTrace();
            
        }
    }
}
