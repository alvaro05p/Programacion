public class Profesor extends Persona {
    private String ndespacho;

    // Constructor que llama al constructor parametrizado de Persona
    public Profesor(String nombre, String apellidos, String nif, String ndespacho) {
        super(nombre, apellidos, nif);
        this.ndespacho = ndespacho;
    }

    // Constructor que llama al constructor parametrizado de Persona
    public Profesor(String nombre, String apellidos, String nif, Direccion direccion, String ndespacho) {
        super(nombre, apellidos, nif, direccion);
        this.ndespacho = ndespacho;
    }

    // Getters y setters
    public String getNdespacho() {
        return ndespacho;
    }

    public void setNdespacho(String ndespacho) {
        this.ndespacho = ndespacho;
    }

    // Método toString
    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", nif='" + getNif() + '\'' +
                ", direccion=" + getDireccion() +
                ", ndespacho='" + ndespacho + '\'' +
                '}';
    }
}
