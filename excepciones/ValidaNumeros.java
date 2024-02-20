import java.util.Scanner;

public class ValidaNumeros{

    //Comprobamos si es un numero entero

    public static void LeeInt(){
        
        Scanner sc = new Scanner(System.in);
        
        try {

            int entero = sc.nextInt();

            System.out.println(entero);

            System.out.println("Es un numero entero "+entero);

        } catch (Exception e) {

            System.out.println("No es un numero entero");
    
        }

    }

    


}