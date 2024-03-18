package Astronomia;
import java.io.Serializable;

public class Galaxia implements Serializable{
    
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
        String cons = Con.replaceAll("\"","");
        String Rad = Ra.replaceAll("\"","");
        String Decl = Dec.replaceAll("\"","");
        String Magn = Mag.replaceAll("\"","");

        return objeto+" "+cons+" "+Rad+" "+Decl+" "+Magn;

    }

    public String getObject() {

        String objeto = Object.replaceAll("\\s","").replaceAll("\"","");
    
        return objeto;
    
    }

    public String sinObjeto() {

        String cons = Con.replaceAll("\"","");
        String Rad = Ra.replaceAll("\"","");
        String Decl = Dec.replaceAll("\"","");
        String Magn = Mag.replaceAll("\"","");

        return cons+" "+Rad+" "+Decl+" "+Magn;
    
    }




}