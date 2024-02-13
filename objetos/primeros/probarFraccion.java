package primeros;
import lib.Fraccion;
import java.util.Scanner;

public class probarFraccion {
    
    public static void main(String[] args) {
        
        Fraccion func = new Fraccion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Numerador");
        int num=sc.nextInt();
        System.out.println("Denominador");
        int den=sc.nextInt();

        while (true){

            
            System.out.println("1.Invertir");
            System.out.println("2.Simplificar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            int opcion=sc.nextInt();
            System.out.println("\033[H\033[2J");
            

            switch (opcion) {
                case 1:

                    func.invertir(num,den);
                    System.out.println(func.getFraccion());
                    break;

                case 2:
                    
                    func.simplificar();
                    System.out.println(func.getFraccion());
                    break;

                case 3:
                  int mult=sc.nextInt();
                    func.multiplicar(mult);
                    System.out.println(func.getFraccion());
                    break;

                case 4:
                    
                    int div=sc.nextInt();
                    func.dividir(div);
                    System.out.println(func.getFraccion());
                    break;
            
                default:
                    break;
            }

        }

    }

}
