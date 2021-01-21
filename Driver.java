import java.util.Scanner;

public class Driver implements RadioInterface{
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de Radio.");
        System.out.println("Elige una de las siguientes opciones: ");

        Scanner scan = new Scanner();
        boolean salida = false;
        Vista vista = new Vista();
        Radio radio = new Radio();
        Emisoras emisora = new Emisoras();
        int buscador = 0;
        double EstacionActual;

        while(salida == false){
            vista.Menu();
            int eleccion = scan.nextInt();

            if (eleccion == 1){
                radio.Power();
                radio.getEstado();

            } else if (eleccion == 2){
                radio.Cambio();
                radio.getEstacion();

            } else if (eleccion == 3){
                buscador = buscador +1;
                boolean frecu = radio.getfrecuencia();
                if(frecu == false){
                    EstacionActual = emisora.getEmisoraAM(buscador);
                } else if (frecu == true){
                    EstacionActual = emisora.getEmisoraFM(buscador);
                }

                vista.Estacion_actual(EstacionActual);

            } else if (eleccion == 4){
                buscador = buscador -1;
                boolean frecu = radio.getfrecuencia();
                if(frecu == false){
                    EstacionActual = emisora.getEmisoraAM(buscador);
                } else if (frecu == true){
                    EstacionActual = emisora.getEmisoraFM(buscador);
                }
                
            } else if (eleccion == 5){
                vista.Favoritas();

            
            } else if (eleccion == 6){
                
            } else if (eleccion == 7){
                System.out.println("Apagando el sistema...");
                salida = true;
            }
        }
    }
}