/**********************
 Simulador.java
 Autor: Daniel Cabrera 20289, Jorge Perez
 Última modificación: 2021-11-01
 **********************/

import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        System.out.println("Bienvenido al  programa de Radio!");
        System.out.println("Elige una de las siguientes opciones: ");
        Scanner scan = new Scanner(System.in);
        boolean salida = false;
        Vista vista = new Vista();
        Radio radio = new Radio();
        Emisoras emisoras = new Emisoras();
        int buscador = 0;
        double EstacionActual = 94.9;

        while (salida == false) { //Loop que continua mostrando el metodo del Menu de Vista.java
            vista.Menu(); // llamado del metodo Menu de Vista.java
            int eleccion = scan.nextInt(); //variable para el ingreso del usuario

            if (eleccion == 1) { //Seleccion de opcion 1, se llama a los metodos Power y getEstado de Radio.java
                radio.Power();
                radio.getEstado();
            }else if(eleccion == 2){ // Seleccion de la opcion 2, cambia de emisora entre AM y FM, llama a los metodos Cambio y getEstacion de Radio.java
                radio.Cambio();
                radio.getEstacion();
            }else if(eleccion == 3){ //Seleccion de la opcion 3, aumenta la emisora en la que se encuentra el usuario, dependiendo si es FM o AM. Llama a getEmisoraAM y getEmisoraFM de Emisoras.java
                buscador += 1;
                boolean frecu = radio.getFrecuencia();
                if (frecu == false) {
                    EstacionActual = emisoras.getEmisoraAM(buscador);
                } else if(frecu == true){
                    EstacionActual = emisoras.getEmisoraFM(buscador);
                }
                System.out.println("Estacion actual: " + emisoras.round(EstacionActual, 2));
            }else if(eleccion == 4){ //Seleccion de la opcion 4, decrementa la emisora en la que se encuentra el usuario, dependiendo si es FM o AM. Llama a getEmisoraAM y getEmisoraFM de Emisoras.java
                buscador -= 1;
                boolean frecu = radio.getFrecuencia();
                if (frecu == false) {
                    EstacionActual = emisoras.getEmisoraAM(buscador);
                } else if(frecu == true){
                    EstacionActual = emisoras.getEmisoraFM(buscador);
                }
                System.out.println("Estacion actual: " + emisoras.round(EstacionActual, 2));
            }else if(eleccion == 5){ //Seleccion de la opcion 5, guarda la estacion actual en uno de 2 arrays con 6 espacios, uno para AM y otro para FM.
                vista.Favoritas(radio.getFavAM(), radio.getFavFM(), radio.getFrecuencia());
                System.out.println("Elige donde guardar la estacion.");
                int resp = scan.nextInt();
                int respuesta = resp - 1;
                if (radio.getFrecuencia() == false) {
                    radio.setFavAM(respuesta, EstacionActual);
                } else if(radio.getFrecuencia() == true){
                    radio.setFavFM(respuesta, EstacionActual);
                }
            }else if(eleccion == 6){ //Seleccion de la opcion 6, muestra las estaciones guardadas dependiendo de la emisora en la que se encuentre el usuario, ya sea en AM o FM.
                vista.Favoritas(radio.getFavAM(), radio.getFavFM(), radio.getFrecuencia());
                System.out.println("Ingrese la estacion a la cual desea ir.");
                int resp2 = scan.nextInt();
                int respuesta2 = resp2 - 1;
                if (radio.getFrecuencia() == false) {
                    Double b = radio.devolucionAM(respuesta2);
                    EstacionActual = b;
                } else if (radio.getFrecuencia() == true){
                    Double b = radio.devolucionFM(respuesta2);
                    EstacionActual = b;
                }
            }else if(eleccion == 7){ //Seleccion de la opcion 7, apaga la radio y termina el Loop.
                System.out.println("Apagando Radio...");
                salida = true;
            }
            vista.mostrarEstacion(radio.getFrecuencia()); //llamado del metodo mostrarEstacion de Vista.java
            System.out.println("Estacion actual: " + emisoras.round(EstacionActual, 2));
        }
    }
}
