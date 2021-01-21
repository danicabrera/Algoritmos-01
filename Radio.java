public class Radio{
    boolean Estado = false;
    boolean Estacion = true;
    Double estacionActual = 94.9;

    Double[] FavoritosAM = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    Double[] FavoritosFM = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

    Emisoras emisora = new Emisoras();

    public Radio(){}

    public void Power() { //metodo que enciende la radio
        if (Estado == false){
            Estado = true;
        } else if (Estado == true){
            Estado = false;
        }
    }

    public void setFavAM(int i, Double n) { //metodo que guarda una radio en el array de Favoritas de AM
        FavoritosAM[i] =  n;
    }

    public void setFavFM(int i, Double n) { //metodo que guarda una radio en el array de Favoritas de FM
        FavoritosFM[i] =  n;
    }

    public Double devolucionAM(int i) { // metodo que devuelve la radio favorita deseada en AM
        Double ejemplo = FavoritosAM[i];
        return ejemplo;
    }

    public Double devolucionFM(int i) { // metodo que devuelve la radio favorita deseada en FM
        Double ejemplo = FavoritosFM[i];
        return ejemplo;
    }

    public Double[] getFavAM() { // metodo que devuelve la radio favorita deseada en FM
        return FavoritosAM;
    }

    public Double[] getFavFM() { // metodo que devuelve la radio favorita deseada en FM
        return FavoritosFM;
    }

    public void Cambio() {
        if (this.Estacion == false){
            this.Estacion = true;
        } else{
            this.Estacion = false;
        }
    }

    public boolean getFrecuencia() {
        return Estacion;
    }

    public void getEstado(){
        if (Estado == false){
            System.out.println("La radio se encuentra apagada");
        } else if (Estado == true){
            System.out.println("La radio se ha encendido");
        }
    }

    public void getEstacion() {
        if (Estacion == false){
            System.out.println("AM");
        } else if (Estacion == true){
            System.out.println("FM");
        }
    }

    public void getEstacionActual() {
        System.out.println("Estacion actual " + estacionActual);
    }
    

}