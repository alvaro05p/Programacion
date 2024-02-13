package lib;




public class Pizza {
    
    private String estado;
    private String tipo;
    private String tamaño;
    private static int pedidas;
    private static int servidas;

    public Pizza(String tipo,String tamaño){

        this.estado="pedida";
        this.tipo=tipo;
        this.tamaño=tamaño;
        pedidas+=1;

    }

    public String toString() {
        
        return  "pipsa, "+tipo+", "+tamaño+", "+estado;

    }

    public void sirve(){

        if (this.estado.equals("pedida")){
            
            this.estado="servida";
            servidas+=1;
        
        }else{
            
            System.out.println ("Esta pizza ya se ha sevido");
        
        }
        

    }


    public static int getTotalServidas(){

        return servidas;

    }

    public static int getTotalPedidas(){

        return pedidas;

    }

	









}
