import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {

        while (true){

            Formulario form = new Formulario();
            ArrayList<Formulario> formulario= new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int num=0;
            System.out.println( "1.- Crear pedido");
            System.out.println("2.- Crear devolucion");
            System.out.println("3.- Crear reclamacion");
            System.out.println("4.- Cerrar reclamación");
            System.out.println("5.- Imprimir formulario por ID");
            System.out.println("6.- Imprimir todas las reclamaciones");
            System.out.println("7.- Imprimir todos los formularios");
            System.out.println("0.- Salir");

            String nombre;
            String ID;
            String producto;
            float precio;
            String texto;
            String estado;


            int opcion = sc.nextInt();

            switch (opcion) { 
                case 1:
                    //Crear pedido
                    num++;
                    nombre = sc.next();
                    ID = "PE "+num;
                    producto = sc.next();
                    precio = sc.nextFloat();

                    form.setNombre(nombre);
                    form.setPrecio(precio);
                    form.setProducto(producto);

                    

                break;

                case 2:
                    //Crear devolucion
                    num++;
                    nombre = sc.next();
                    ID = "DE "+num;
                    producto = sc.next();
                    precio = sc.nextFloat();

                    form.setNombre(nombre);
                    form.setPrecio(precio);
                    form.setProducto(producto);
                    form.setID(ID);

                    
                
                break;

                case 3:

                    //Crear reclamacion
                    num++;
                    texto = sc.next();
                    estado = "abierta";
                    ID = "RE "+num;

                    form.setTexto(texto);
                    form.setEstado(estado);

                break;

                case 4:

                    //Cerrar reclamacion 
                    
                
                break;

                case 5:

                
                break;

                case 6:

                    


                break;

                case 7:

                    //Mostrar todos los formularios

                    String mostrar = formulario.toString();

                    System.out.println(mostrar);

                break;

                case 0:
                
                break;
                
                default:
                // Default secuencia de sentencias.
            }

            formulario.add(form);  
            
            
            
            String mostrar = formulario.toString();

            System.out.println(mostrar);

        }
        

        
        

    }

}
