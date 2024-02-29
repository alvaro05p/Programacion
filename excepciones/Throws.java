import java.util.InputMismatchException;
import java.util.Scanner;


public class Throws {

    public static int Division(int numero,int entre) throws Exception {

        int resultado = numero/entre;

        return resultado;


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{

            int numero = sc.nextInt();
            int entre = sc.nextInt();
            

            int resultado = Division(numero, entre);

            System.out.println(resultado);

        }catch(InputMismatchException e){

            System.out.println("Deben ser numeros");

        }catch(Exception  e) {
         
            System.out.println("Problemas con la division");
         
        }

    }


}
