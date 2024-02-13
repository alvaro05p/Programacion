package vehiculos;
import java.util.Scanner;
import vehiculos.Bicicleta;
import vehiculos.Coche;
import vehiculos.Vehiculo;

public class usarVehiculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Bicicleta bicicleta = null; 
        Coche coche = null; 

        do {
            
        
            
            System.out.println("\nVEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda en bicicleta");
            System.out.println("2. Anda en coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometraje total");
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    bicicleta = new Bicicleta();
                    System.out.println("Cuantos km quieres recorrer en bici?");
                    int kmBici = sc.nextInt();
                    bicicleta.recorrer(kmBici); 
                    System.out.println("Has andado en bicicleta.");
                    break;
                case 2:
                    
                    coche = new Coche();
                    System.out.println("Cuantos km quieres recorrer en coche?");
                    int kmCoche = sc.nextInt();
                    coche.recorrer(kmCoche); 
                    System.out.println("Has andado en coche.");
                    break;

                case 3:
                    
                    System.out.println("El kilometraje de la bicicleta es: " + Vehiculo.getKilometrosRecorridos(bicicleta));
                    break;

                case 4:
                    
                    System.out.println("El kilometraje del coche es: " + Vehiculo.getKilometrosRecorridos(coche));
                    break;

                case 5:
                    
                    System.out.println("El kilometraje total es: " + Vehiculo.getKilometrosTotales());
                    break;

                case 6:
                    
                    System.out.println("El número total de vehículos es: " + Vehiculo.getVehiculosCreados());
                    break;

                case 7:
                    
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    
                    System.out.println("Opción no válida. Inténtalo de nuevo.");

            }
        
        } while (opcion != 7);

        sc.close();
    }
}

