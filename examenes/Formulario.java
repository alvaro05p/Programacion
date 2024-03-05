import java.util.ArrayList;

public class Formulario {
    
    private String nombre;
    private String ID;
    private String producto;
    private float precio;
    
    public Formulario(){

        this.nombre=nombre;
        this.ID = ID;
        this.producto = producto;
        this.precio = precio;
        

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

    public void setID(String ID) {
        this.ID = ID;
    }

    
    public String toString() {

            return "Nombre: "+ nombre +"\nproducto: " + producto +"\nprecio: " + precio +"\nid: " + ID;
                
            //return "Texto: " + texto + "\nEstado: " + estado + "\nID: "+ID;
       
    }

    
   

    public static void buscarPorId(ArrayList<Formulario> formulario ,String idBuscada){

        for(Formulario buscado : formulario){

            if (buscado.getID().equals(idBuscada)){

                System.out.println(buscado);

            }

        }

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

    

}