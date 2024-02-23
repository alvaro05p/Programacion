import java.util.Scanner;

public class ValidaNumeros{

    
    //Comprobamos si es un numero entero


    public  static void LeeInt(){
        
        
        
        try {

            Scanner sc = new Scanner(System.in);

            sc.nextInt();

        } catch (Exception e) {

            System.out.println("No es un numero entero");

            
    
        }
        
    }

    public static void LeeIntPos(){

        Scanner sc = new Scanner(System.in);

        try {

            int entero = sc.nextInt();

            if (entero <= 0){

                throw new Exception("El numero debe ser positivo");
            }

        } catch (Exception e) {

            System.out.println("No es un numero entero positivo");
            
        }

    }

    public static void LeeIntRango(){

        Scanner sc = new Scanner(System.in);

        try {

            int entero = sc.nextInt();

            if (entero > 10 && entero < 60){

                throw new Exception("El numero debe ser mayor de 10 y menor de 60");
            }

        } catch (Exception e) {

            System.out.println("El numero no esta dentro del rango");
            
        }

    }



    


}