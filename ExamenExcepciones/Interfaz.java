import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean datosValidos = false;
        while (!datosValidos) {
            try {
                System.out.println("Referencia: ");
                String ref = sc.next();

                System.out.println("Metros cúbicos: ");
                int m3 = sc.nextInt();

                Calculos calculo = new Calculos();
                float[] calculoArray = calculo.getCalculo(ref, m3);

                System.out.println("Tablones necesarios: " + calculoArray[0] + " Precio final: " + calculoArray[1] + " precioM3: " + calculoArray[2]);
                
                datosValidos = true; // Si llegamos aquí sin excepciones, los datos son válidos y salimos del bucle.

            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un valor válido.");
                sc.nextLine(); // Limpiamos el buffer del Scanner para evitar un bucle infinito
            } catch (NullPointerException e) {
                System.out.println("Error: No se pudo encontrar la referencia en el catálogo.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                e.printStackTrace();
            }
        }
        sc.close(); // Cierra el Scanner al finalizar
    }
}
