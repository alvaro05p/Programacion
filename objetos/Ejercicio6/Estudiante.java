public class Estudiante extends Persona{

    private int IDestudiante;

    //Constructores

    public Estudiante(String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
    }

    public Estudiante(String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
    }

    public Estudiante(String nombre, String apellidos, String nif,int IDestudiante) {
        super(nombre, apellidos, nif);
    }

    public Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int IDestudiante) {
        super(nombre, apellidos, nif, direccion);
    }    

    //Getters y setters

    /**
     * @return int return the ID
     */
    public int getIDestudiante() {
        return IDestudiante;
    }

    /**
     * @param ID the ID to set
     */
    public void setIDestudiante(int ID) {
        this.IDestudiante = ID;
    }

}