import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        boolean rep;
        
        int apuestas = sc.nextInt();
        
        int[] nAnteriores;
        int[] eAnteriores;

        
        for (int i=0;i<apuestas;i++){
            
            //Reiniciamos los numeros almacenados

            nAnteriores = new int [5];
            eAnteriores = new int [2];

            //De momento el numero no es repetido

            rep = false;

            for(int y=0;y<7;y++){

                //Generamos numeros

                int numero = (int) ((50 * Math.random()) + 1);
                int estrella = (int) ((10 * Math.random()) + 1);

                //Recorremos los almacenados

                for(int x=0;x<=y;x++){

                    //Si el numero o estrella coinciden ya esta ese numero

                    if(nAnteriores[x]==numero || eAnteriores[x] == estrella){
                        
                        rep=true;

                    }else{

                        nAnteriores[y]=numero;
                        eAnteriores[y]=estrella;
                    
                    }
                    
                }
                
                //Si no es repetido lo mostramos

                if (!rep){
    
                    if (y <= 4){
                        
                        System.out.print(numero+" ");

                    }else if(y == 5){

                        System.out.print("+ "+estrella+" ");

                    }else{

                        System.out.print(estrella);

                    }

                }else{

                    //Si lo es, volvemos al paso anterior

                    y-=1;

                }

            }

            System.out.println("\n");
            
        }
    }
    
}