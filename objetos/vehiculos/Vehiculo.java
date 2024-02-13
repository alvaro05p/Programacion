package vehiculos;

public class Vehiculo {
    
    //Creamos los static, son los mismos para todos los vehiculos
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    //Estos no son static porque es un valor que varia depende del vehiculo
    private int kilometrosRecorridos;

    public Vehiculo(){

        vehiculosCreados++;

        kilometrosRecorridos=0;

    }

    //Funcion que usamos para sumar km a cualquier vehiculo

    public void recorrer(int distancia){

        kilometrosRecorridos+=distancia;
        kilometrosTotales+=distancia;

    }


    //Getters, para mostrar los resultados

    public static int getVehiculosCreados(){

        return vehiculosCreados;

    }

    public static int getKilometrosTotales(){

        return kilometrosTotales;

    }

    public static int getKilometrosRecorridos(Vehiculo vehiculo){

        return vehiculo.kilometrosRecorridos;

    }
       

}
