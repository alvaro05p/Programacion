public class Reclamaciones extends Formulario{
    
    private String texto;
    private String estado;

    
    public Reclamaciones(){

        this.texto=texto;
        this.estado=estado;

    }

    public Reclamaciones(String texto,String estado){

        this.texto=texto;
        this.estado=estado;

    }

    public String getReclamaciones() {
        
        return "Texto: "+texto+"\nEstado: "+ estado;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setTexto(String texto){
        this.texto=texto;
    }

    public String getEstado(){
        return estado;
    }
    public String getTexto(){
        return texto;
    }

    

}
