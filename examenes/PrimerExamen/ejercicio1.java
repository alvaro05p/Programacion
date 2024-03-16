import java.util.Scanner;


public class ejercicio1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Como te llamas? ");
        String nombre = sc.next();
        
        System.out.println("Hola "+nombre);

        boolean continua = true;
        int fallos = 0;
        
        while (continua){

            System.out.print("Sabes programar? ");
            String respuesta = sc.next();
            if (respuesta.equals("Si")) {

                System.out.print("Cuantos años llevas programando? ");

                int tiempo = sc.nextInt();

                if (tiempo <= 1){
                    System.out.println("Novato!");
                }else if(tiempo <=5){
                    System.out.println("Experto!");
                }else{
                    System.out.println("Oh maestro, te adoramos!");
                }
                continua = false;

            }else if (respuesta.equals("No")){

                System.out.println("Loooser!");
                continua=false;

            }else{

                fallos++;

            }

            if(fallos == 3){

                System.out.println("Si no contestas bien me voy");
                continua = false;
            }

        }

        sc.close();

    }


    

}