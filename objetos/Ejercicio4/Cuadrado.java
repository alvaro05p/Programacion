

public class Cuadrado extends Figura{
    
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado){

        this.lado=lado;

    }

    public double area (){
   
        this.area=lado*lado;
        return area;

    }

    public double perimetro(){
        
        this.perimetro=lado*4;
        return perimetro;

    }


    
}