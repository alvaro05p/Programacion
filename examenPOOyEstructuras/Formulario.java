public class Formulario {
    
    private String nombre;
    private String ID;
    private String producto;
    private float precio;
    private String texto;
    private String estado;


    public Formulario(){

        this.nombre=nombre;
        this.ID = ID;
        this.producto = producto;
        this.precio = precio;
        this.texto = texto;
        this.estado = estado;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    public String toString() {
        
        return "Nombre: "+ nombre +" producto " + producto +" precio: " + precio +" id: " + ID;
    }

    
    public String getReclamacion() {
        
        return "Texto: "+texto+" ID: " + ID;
    }
    

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return String return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @return String return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @return float return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @return String return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

}