public class Persona{


    private String nombre;
    private String apellidos;
    private String nif;
    private Direccion direccion;
    
    public Persona (String nombre,String apellidos,String nif){

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nif=nif;

    }

    public Persona (String nombre,String apellidos,String nif, Direccion direccion){

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nif=nif;
        this.direccion = direccion;

    }

}