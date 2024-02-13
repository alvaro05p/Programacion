package lib;

public class Cafetera {
    
    private int capMaxima;
    private int cantActual;

    //Primer constructor

    public Cafetera(){

        this.capMaxima=1000;
        this.cantActual=0;

    }
   
    public Cafetera (int a_cantActual){

        this.cantActual=capMaxima;

    }   

    public Cafetera (int a_cantActual, int a_capMaxima){

        this.capMaxima=a_capMaxima;
        this.cantActual=a_cantActual;

        if (cantActual > capMaxima){

            cantActual = capMaxima;

        }

    }

    public void llenarCafetera(){
        
        this.cantActual=capMaxima;

    }

    public void servirTaza(int taza){
        
        if (taza > cantActual){

            this.cantActual=0;

        }else{
        
            this.cantActual-=taza;

        }

    }

    public void vaciarCafetera(){

        this.cantActual=0;

    }

    public void agregarCafe(int add){

        if(add > capMaxima){

            this.cantActual = 1000;

        }else{
        
            this.cantActual+=add;

        }
    }




    /**
     * @return int return the capMaxima
     */
    public int getCapMaxima() {
        return capMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }


    

}