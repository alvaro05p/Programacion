package Astronomia;

import java.io.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        try {
            
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Astronomia/SAC.bin"));

            Scanner sc = new Scanner(System.in);

            System.out.println("Elige una opcion: ");
            System.out.println("1.Buscar por nombre del objeto.");
            System.out.println("2.Buscar por constelacion.");
            System.out.println("3.Buscar por magnitud maxima.");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre de objeto: ");
                    
                    String galaxiaNOM = sc.nextLine();

                    while (true) {
                        try {
                            Object objeto = lector.readObject();
                            if (objeto instanceof Galaxia) {
                                Galaxia galaxia = (Galaxia) objeto;
        
                                if(galaxia.getObject().equals(galaxiaNOM)){
        
                                    System.out.println(galaxia.sinObjeto());
        
                                }
                            }
                        } catch (EOFException e) {
                            // Se llegó al final del archivo
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Constelacion: ");
                    
                    String constelacionNOM = sc.nextLine();

                    while (true) {
                        try {
                            Object objeto = lector.readObject();
                            if (objeto instanceof Galaxia) {
                                Galaxia galaxia = (Galaxia) objeto;
        
                                if(galaxia.getConst().equals(constelacionNOM)){
        
                                    System.out.println(galaxia.toString());
        
                                }
                            }
                        } catch (EOFException e) {
                            // Se llegó al final del archivo
                            break;
                        }
                    }
                    break;

                    case 3:
                    System.out.print("Magnitud MAX: ");
                    Float magnitudMax = sc.nextFloat();

                    while (true) {
                        try {
                            Object objeto = lector.readObject();
                            if (objeto instanceof Galaxia) {
                                Galaxia galaxia = (Galaxia) objeto;
        
                                if(galaxia.getMag() <= magnitudMax){
        
                                    System.out.println(galaxia.toString());
        
                                }
                            }
                        } catch (EOFException e) {
                            // Se llegó al final del archivo
                            break;
                        }
                    }    
            
                default:
                    break;
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
