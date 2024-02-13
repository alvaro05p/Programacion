public class Profesor extends Persona{


    private int ndespacho;

    public Profesor(String nombre, String apellidos, String nif, int ndespacho) {
        super(nombre, apellidos, nif);
        this.ndespacho = ndespacho;
    }

    public Profesor(String nombre, String apellidos, String nif, Direccion direccion, int ndespacho) {
        super(nombre, apellidos, nif, direccion);
        this.ndespacho = ndespacho;
    }

    public Profesor(String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
        this.ndespacho = ndespacho;
    }

    public Profesor(String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.ndespacho = ndespacho;
    }
    

    /**
     * @return int return the ndespacho
     */
    public int getNdespacho() {
        return ndespacho;
    }

    /**
     * @param ndespacho the ndespacho to set
     */
    public void setNdespacho(int ndespacho) {
        this.ndespacho = ndespacho;
    }

}