import java.util.InputMismatchException;
import java.util.Scanner;


public class Division {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        try{

            int numero = sc.nextInt();
            int entre = sc.nextInt();
            int resultado = numero/entre;

            System.out.println(resultado);

        }catch(InputMismatchException e){

            System.out.println("Deben ser numeros");

        }catch(ArithmeticException e){

            System.out.println("Excepcion Aritmetica");

        }catch(Exception  e) {
         
            System.out.println("Problemas con la division");
         
        }

    }


}
