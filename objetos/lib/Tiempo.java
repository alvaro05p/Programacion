package lib;

public class Tiempo {
    
    private int hor;
    private int min;
    private int seg;
    private static int devolver;
    private static int total1;
    private static int total2;

    

    public Tiempo(int hor, int min, int seg){

        this.hor=hor;
        this.min=min;
        this.seg=seg;

    }

    
    public String toString() {
        
        return  hor + " horas " + min + " minutos " + seg + " segundos";

    }

    public void suma (Tiempo tiempo2) {
        
        int hor2 = tiempo2.getHor();
        int min2 = tiempo2.getMin();
        int seg2 = tiempo2.getSeg();
        
        this.hor+=hor2;
        this.min+=min2;
        this.seg+=seg2;

        if (seg > 60){

            min +=1;
            seg -=60;

        }
        
        if (min > 60){

            hor +=1;
            min -= 60;

        }

    }

    public void resta (Tiempo tiempo2) {
        
        int hor2 = tiempo2.getHor();
        int min2 = tiempo2.getMin();
        int seg2 = tiempo2.getSeg();
        
        this.hor-=hor2;
        this.min-=min2;
        this.seg-=seg2;

        if (seg < 0){

            seg = 0;

        }

        if (min < 0){

            min = 0;

        }

        if (hor < 0){

            hor = 0;

        }

    }

    
    public int compareTo(Tiempo tiempo2) {

        int total1 = this.hor * 3600 + this.min * 60 + this.seg;
        
        int total2 = tiempo2.getHor() * 3600 + tiempo2.getMin() * 60 + tiempo2.getSeg();

        if (total1 > total2) {
        
            return -1;
        
        } else if (total1 < total2) {
        
            return 1;
        
        } else {
        
            return 0;
        
        }
    }

    
   

   

    /**
     * @return int return the hor
     */
    public int getHor() {
        return hor;
    }

    /**
     * @param hor the hor to set
     */
    public void setHor(int hor) {
        this.hor = hor;
    }

    /**
     * @return int return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return int return the seg
     */
    public int getSeg() {
        return seg;
    }

    /**
     * @param seg the seg to set
     */
    public void setSeg(int seg) {
        this.seg = seg;
    }

}
