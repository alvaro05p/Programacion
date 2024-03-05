import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean sigue = true;
        ArrayList<Formulario> formulario = new ArrayList<>();
        ArrayList<Reclamaciones> reclamacion = new ArrayList<>();

        while (sigue) {

            System.out.println("1.- Crear pedido");
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
                    // Crear pedido
                    Formulario form = new Formulario();
                    num++;
                    System.out.print("Nombre: ");
                    nombre = sc.next();
                    ID = "PE " + num;
                    System.out.print("Producto: ");
                    producto = sc.next();
                    System.out.print("Precio: ");
                    precio = sc.nextFloat();

                    form.setNombre(nombre);

                    form.setPrecio(precio);

                    form.setProducto(producto);

                    form.setID(ID);

                    formulario.add(form);

                    break;

                case 2:
                    // Crear devolucion
                    Formulario devolucion = new Formulario();
                    num++;
                    System.out.println("Nombre: ");
                    nombre = sc.next();

                    ID = "DE " + num;
                    System.out.println("Producto: ");
                    producto = sc.next();
                    System.out.println("Precio: ");
                    precio = sc.nextFloat();

                    devolucion.setNombre(nombre);
                    devolucion.setPrecio(precio);
                    devolucion.setProducto(producto);
                    devolucion.setID(ID);

                    formulario.add(devolucion);

                    break;

                case 3:
                    Reclamaciones reclamar = new Reclamaciones();
                    // Crear reclamacion
                    
                    num++;
                    //Consumir salto de linea
                    sc.nextLine();
                    System.out.println("Texto: ");
                    texto = sc.nextLine();
                    estado = "abierta";
                    ID = "RE " + num;

                    reclamar.setTexto(texto);
                    reclamar.setEstado(estado);

                    reclamacion.add(reclamar);

                    break;

                case 4:
                    
                    break;

                case 5:

                    System.out.println("ID que quieres buscar:");
                    String id = sc.next();
                    Formulario.buscarPorId(formulario, id);

                    break;

                case 6:

                    for (Reclamaciones reclama : reclamacion) {
                        if(reclama.getEstado().equals("abierta")){

                            System.out.println(reclama.getEstado() + "\n" + reclama.getTexto());

                        }
                    }
                

                    break;

                case 7:

                    // Mostrar todos los formularios

                    for (Formulario mostrarForm : formulario) {

                        System.out.println(mostrarForm);

                    }

                    break;

                case 0:
                    sigue = false;
                    break;

                default:
                    // Default secuencia de sentencias.
            }

        }

    }

}
