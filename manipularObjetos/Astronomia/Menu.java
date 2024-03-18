package Astronomia;

import java.io.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        try {
            
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Astronomia/SAC.bin"));

            Scanner sc = new Scanner(System.in);

            System.out.println("Elige una opcion: ");
            System.out.println("1.Mostrar objeto completo.");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Identificador de objeto: ");
                    
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
            
                default:
                    break;
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
