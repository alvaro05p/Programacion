public class Pieza {
    
    private String nombre;
    private String color;

    public Pieza(String nombre,String color){



    }

    public double area(){

            return 1;

        } 

    public boolean equals(Object o) {
        Pieza p = (Pieza) o;
        return this.color.equals(p.color) &&
        this.nombre.equals(p.nombre) &&
        this.area() == p.area();
    }

    public static void main(String[] args) {
        
        try {
            
            Pieza p1 = new Pieza("cuadrado","rojo");
            Pieza p2 = new Pieza("cuadrado","rojo");
            Double d = new Double(1.0);
            String k = "Hola";
            boolean b1 = p1.equals(p2);

            try {

                boolean b2 = d.equals(k);

            } catch (ClassCastException e) {

                System.out.println("Error del tipo cast");
            }

            boolean b3 = k.equals(p2);
            boolean b4 = p1.equals(d);

        } catch (NullPointerException e) {
            
            System.out.println("Error en el objeto: el valor era nulo");

        }

    }

}


