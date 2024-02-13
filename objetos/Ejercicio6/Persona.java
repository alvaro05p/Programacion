public class Persona{


    protected String nombre;
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

 

    public Persona(int iD) {
        //TODO Auto-generated constructor stub
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setNombre(String nombre) {
        this.nombre = apellidos;
    }
    

    


    /**
     * @return String return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return String return the nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * @return Direccion return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}