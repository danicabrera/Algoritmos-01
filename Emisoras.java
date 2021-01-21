import java.util.ArrayList;
public class Emisoras {
    ArrayList<Double> AM = new ArrayList<>();
    ArrayList<Double> FM = new ArrayList<>();

    public Emisoras() { // metodo que aumenta la radio dependiendo de si es AM o FM
        Double a = 530.0;
        Double b = 87.9;

        for(int i = 0; i <= 108; i++){
            AM.add(a);
            a = a + 10;
        }
        for(int j = 0 ; j <= 50; j++){
            FM.add(b);
            b = b + 0.2;
        }
    }

    public double round(double value, int places) { //metodo que redondea las estaciones a 1 solo decimal
        if (places < 0) throw new IllegalArgumentException();
    
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    

    public Double getEmisoraAM(int i) { //metodo que muestra la emisora en AM
        Double emision = AM.get(i);
        return emision;
    }
    public Double getEmisoraFM(int j) { //metodo que muestra la emisora en M
        Double emision = FM.get(j);
        return emision;
    }
}