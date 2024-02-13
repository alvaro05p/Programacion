import java.util.Scanner;

public class LlamarVehiculo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);    

        System.out.println( "VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda en bicicleta");
        System.out.println("2. Anda en coche");
        System.out.println("3. Ver kilometraje de la bicicleta");
        System.out.println("4. Ver kilometraje del coche");
        System.out.println("5. Ver kilometraje total");
        System.out.println("6. Ver vehículos totales");
        System.out.println("7. Salir");
        System.out.print("Elige una opción (1-7): ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cuantos km has hecho con la bici? ");

                int kmB = sc.nextInt();

                

                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Opción no válida");
        }
        
    }
}