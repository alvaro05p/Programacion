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
        return OBJECT+CON+RA+DEC+MAG;
    }

    public String getOBJECT() {
        return OBJECT;
    }

    public String getCON() {
        return CON;
    }

    public String getRA() {
        return RA;
    }

    public String getDEC() {
        return DEC;
    }

    public Double getMAG() {

        String sinEspacios=MAG.trim();

        Double num = Double.parseDouble(sinEspacios);

        return num;
    }

}