public class Galaxia {
    
    private String Object;
    private String Con;
    private String Ra;
    private String Dec;
    private String Mag;

    public Galaxia(String Object,String Con,String Ra,String Dec,String Mag){

        this.Object = Object;
        this.Con = Con;
        this.Ra = Ra;
        this.Dec = Dec;
        this.Mag = Mag;

    }

    public static String readLine() {
       
        throw new UnsupportedOperationException("Unimplemented method 'readLine'");
    }

    @Override
    public String toString() {
        
        String objeto = Object.replaceAll("\\s","").replaceAll("\"","");
        String cons = Object.replaceAll("\"","");
        String Rad = Object.replaceAll("\"","");
        String Decl = Object.replaceAll("\"","");
        String Magn = Object.replaceAll("\"","");

        return objeto+" "+cons+" "+Rad+" "+Decl+" "+Magn;

    }

}