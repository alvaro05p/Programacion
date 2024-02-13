package primeros;
import lib.Tiempo;
import java.util.Scanner;
import java.util.ArrayList; 


public class probarTiempo {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ordH = new ArrayList<Integer>();
        ArrayList<Integer> ordM = new ArrayList<Integer>(); 
        ArrayList<Integer> ordS = new ArrayList<Integer>();
        ArrayList<Integer> ordenar = new ArrayList<Integer>();

        int hor=0,min=0,seg=0;
        int hor2=0,min2=0,seg2=0;

        String accion=sc.next();
        
        
        Tiempo tiempo1 = new Tiempo(hor, min, seg);

        Tiempo tiempo2 = new Tiempo(hor2, min2, seg2);

        
        
        if (accion.equals("suma")){

            

            hor = sc.nextInt();min = sc.nextInt();seg = sc.nextInt();
            hor2 = sc.nextInt();min2 = sc.nextInt();seg2 = sc.nextInt();
            tiempo1.suma(tiempo2);

            System.out.println("Tiempo 1: " + tiempo1.toString());

        }

        if (accion.equals("resta")){

            hor = sc.nextInt();min = sc.nextInt();seg = sc.nextInt();
            hor2 = sc.nextInt();min2 = sc.nextInt();seg2 = sc.nextInt();

            tiempo1.resta(tiempo2);

            System.out.println("Tiempo 1: " + tiempo1.toString());

        }

        if (accion.equals("comparar")){

            System.out.println(tiempo1.compareTo(tiempo2));

        }

        if (accion.equals("ordenar")){

            System.out.println("Introduce 10 tiempos");

            for(int i=0;i<10;i++){
                
                int horIN= sc.nextInt();
                int minIN= sc.nextInt();
                int segIN= sc.nextInt();
                ordH.add(horIN);
                ordM.add(minIN);
                ordS.add(segIN);
                
                //Implementar aqui la funcion compareTo en cada uno
                

            }

            for(int i=0;i<10;i++){

                System.out.println(ordH.get(i)+" "+ordM.get(i)+" "+ordS.get(i));

            }    
        }
        


        
 
    }


}



