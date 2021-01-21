import java.util.ArrayList;

public class Emisoras {

    ArrayList<Double> AM = new ArrayList<>();
    ArrayList<Double> FM = new ArrayList<>();

    public Emisoras(){
        double a = 530.0;
        double b = 87.9;


        for(int i = 0; i < 108; i++){
            AM.add(a);
            a = a + 10.0;
        }

        for(int j = 0; j < 50; j++){
            FM.add(b);
            b = b + 0.2;
        }
    }

    public Double getEmisoraAM(int i){
        Double emision = AM.get(i);
        return emision;
    }

    public Double getEmisoraFM(int i){
        Double emision = FM.get(i);
        return emision;
    } 

}
