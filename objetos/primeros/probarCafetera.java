package primeros;

import lib.Cafetera;
import java.util.Scanner;

public class probarCafetera {
    
    public static void main(String[] args) {
        
        Cafetera func = new Cafetera();
        
        Scanner sc = new Scanner(System.in);

        while (true){

            
            System.out.println("1.Llenar cafetera");
            System.out.println("2.Servir taza");
            System.out.println("3.Vaciar cafetera");
            System.out.println("4.Añadir café");
            int opcion=sc.nextInt();
            System.out.println("\033[H\033[2J");
            

            switch (opcion) {
                case 1:

                    func.llenarCafetera();
                    System.out.println("La cafetera ahora tiene: " + func.getCantActual()+" ml");
                    break;

                case 2:

                    System.out.print("De cuanto es tu taza");
                    int tutaza=sc.nextInt();
                    func.servirTaza(tutaza);
                    System.out.println("La cafetera ahora tiene: " + func.getCantActual()+" ml");
                    break;

                case 3:

                    func.vaciarCafetera();
                    System.out.println("La cafetera ahora tiene: " + func.getCantActual()+" ml");
                    break;

                case 4:
                    
                    int cantCafe=sc.nextInt();
                    func.agregarCafe(cantCafe);
                    System.out.println("La cafetera ahora tiene: " + func.getCantActual()+" ml");
                    break;
            
                default:
                    break;
            }

        }

    }

}
