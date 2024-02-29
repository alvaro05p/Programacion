

public class Vector {
    public static void main(String[] args) {

        int array[] = new int[5];

        try {

            for (int i=0; i < 5; i++){

                if (i == 3){

                    throw new ArrayIndexOutOfBoundsException("No se puede asignar nada al 3er valor");

                }
                array[i]=i;
                System.out.println(array[i]);

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println(e.getMessage());

        }

        

        


    }
}
