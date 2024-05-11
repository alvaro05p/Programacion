import java.io.Serializable;

public class Galaxia implements Serializable{

    private String OBJECT;
    private String CON;
    private String RA;
    private String DEC;
    private String MAG;

    public Galaxia(String OBJECT,String CON,String RA,String DEC,String MAG){

        this.OBJECT=OBJECT;
        this.CON=CON;
        this.RA=RA;
        this.DEC=DEC;
        this.MAG=MAG;
    }

    public String galaxiaToString(){
        return OBJECT+""+CON+""+RA+""+DEC+""+MAG;
    }

}