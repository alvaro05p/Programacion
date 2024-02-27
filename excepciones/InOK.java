import java.util.Scanner;

public class InOK{

    //Comprobamos si es un numero entero

    public static void LeeInt(){

        Scanner sc = new Scanner(System.in);
        
        try {
            
            int numero = sc.nextInt();

            System.out.println("Es entero"); 

        } catch (Exception e) {
            
            System.out.println("Deberia ser un numero");

        }



    }

    //Comprobamos si el numero es positivo

    public static void LeeIntPos(){

        Scanner sc = new Scanner(System.in);

        try {

            int entero = sc.nextInt();

            if (entero <= 0){

                throw new Exception("El numero debe ser positivo");
            }else{

                System.out.println("Es un numero positivo");
            
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        }

    }

    //Numero dentro de rango

    public static void LeeIntRango(){

        Scanner sc = new Scanner(System.in);

        try {

            int entero = sc.nextInt();

            if (entero < 10 || entero > 60){

                throw new Exception("El numero debe ser mayor de 10 y menor de 60");
            }else{

                System.out.println("El numero esta DENTRO del rango");

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        }

    }

    //Si es un numero real

    public static void LeeDou(){

        Scanner sc = new Scanner(System.in);
        
        try {
            
            Double numero = sc.nextDouble();

            System.out.println("Es real"); 

        } catch (Exception e) {
            
            System.out.println("Deberia ser un numero real");

        }



    }

    //Rango con numero real

    public static void LeeDouRango(){

        Scanner sc = new Scanner(System.in);

        try {

            Double real = sc.nextDouble();

            if (real < 10.0 || real > 60.0){

                throw new Exception("El numero debe ser mayor de 10 y menor de 60");
  
            }else{

                System.out.println("El numero esta DENTRO del rango");

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        }

    }

    //Comprobar si existe un string

    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};

    public static void validaString(){

        Scanner sc = new Scanner(System.in);
        String compositor = sc.nextLine();

        try{

            boolean existe=false;
            

            for (int i=0; i < InOK.COMPOSITORES.length; i++){
                
                if (compositor.equals(InOK.COMPOSITORES[i])){

                    existe = true;
                }

            }

            if (existe == true){

                System.out.println("Ese compositor SI que esta");

            }

            if (existe == false){

                throw new Exception("NO esta ese compositor");

            }
    
        }catch (Exception e) {
            
            System.out.println(e.getMessage());

        }
    }


}