package lib;

public class Fraccion {

    private int num;
    private int den;
    private int guardar;
    private int guardar2;
    private int simpli;

    public Fraccion() {

        this.num = 10;
        this.den = 5;

    }

    public Fraccion(int num, int den) {

        this.num = num;
        this.den = den;

    }

    public void invertir(int num, int den) {

        this.guardar = num;
        this.guardar2 = den;

        this.num = guardar2;
        this.den = guardar;

    }

    public void simplificar() {
        
        int mcd = mcd (num,den);

        num /= mcd;
        den /= mcd;

    }

    public int mcd(int a, int b) {
        
        if (b == 0){

            return a;

        }

        return  mcd(b, a % b);
        
    }

    public void multiplicar(int mult) {

        this.num *= mult;
        this.den *= mult;

    }

    public void dividir(int div) {

        this.guardar = num;
        this.guardar2 = den;

        this.num = guardar2;
        this.den = guardar;

        this.num /= div;
        this.den /= div;

    }

    // Getters and setters

    public String getFraccion() {

        return num + "/" + den;

    }

}
