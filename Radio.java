public class Radio {
    boolean Estado = false;
    boolean Estacion = false;
    Double Estacion_actual = 94.9;

    Double[] FavoritosAM = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    Double[] FavoritosFM = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

    Emisoras emisora = new Emisoras();

    public Radio(){}

    public void Power(){
        if (Estado == false){
            Estado = true;
        } else if ( Estado == true){
            Estado = false;
        }
    }

    public Double[] getFavAM(){
        return FavoritosAM;
    }

    public Double[] getFavFM(){
        return FavoritosFM;
    }

    public void Cambio(){
        if (Estacion == false){
            Estacion = true;
        } else if ( Estacion == true){
            Estacion = false;
        }
    }

    public boolean getfrecuencia(){
        return Estacion;
    }

    public void getEstado(){
        if (Estado == false){
            System.out.println("La radio se encuentra apagada.");
        } else if ( Estado == true){
            System.out.println("La radio se ha encendido.");
        }
   
    }


    public void getEstacion(){
        if (Estacion == false){
            System.out.println("La radio esta en AM.");
        } else if (Estacion == true){
            System.out.println("La radio esta en FM.");
        }
   
    }

    public void getEstacionActual(){
    System.out.println("Estacion actual" + Estacion_actual);

    }

}
