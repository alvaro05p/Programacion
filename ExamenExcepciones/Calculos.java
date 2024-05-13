import java.util.HashMap;
import java.util.Scanner;


public class Calculos {
    
    public float[] getCalculo(String ref,int m3){
        
        HashMap<String,Tablon> lista = Catalogo.listado();

        Tablon tablonX=lista.get(ref);

        int alto=tablonX.getAlto();
        int ancho=tablonX.getAncho();
        int largo=tablonX.getLargo();
        float precio=tablonX.getPrecio();

        int mm3tablon = alto * ancho * largo;
        int mm3necesarios = m3 * 1000000000;

        int tablonesNecesarios=mm3necesarios/mm3tablon;

        float tablonesNecesariosFloat=(float) tablonesNecesarios;

        float precioFinal = tablonesNecesariosFloat*precio;

        float precioM3 = precioFinal/m3; 

        return new float[] {tablonesNecesariosFloat, precioFinal, precioM3};
    }

    

    

}

