public class Vista {
    public Vista(){}
    public void Menu() { // metodo que muestra el Menu
        System.out.println("");
        System.out.println("*****MENU*****");
        System.out.println("1. Prender/Apagar radio");
        System.out.println("2. Cambio AM/FM");
        System.out.println("3. Avanzar");
        System.out.println("4. Retroceder");
        System.out.println("5. Guardar emisora");
        System.out.println("6. Favoritas");
        System.out.println("7. Salir del programa");

    }

    public void mostrarEstado(boolean a){ // metodo que muestra si la  radio esta apagada o encendida
        if(a == false){
            System.out.println("La radio esta apagada");
        } else if (a == true){
            System.out.println("La radio esta prendida");
        }
    }

    public void mostrarEstacion(boolean a){ // metodo que muestra si la  radio esta en AM o FM
        if(a == false){
            System.out.println("La radio se encuentra en AM");
        } else if (a == true){
            System.out.println("La radio se encuentra en FM");
        }
    }

    public void Favoritas(Double[] am, Double[] fm, boolean a) { // metodo que muestra los arrays de radios favoritas en AM y FM
        if (a == false) {
            System.out.println("\nFavoritas AM: \n");
            for (int i = 0; i < 6; i++){
                int a2 = i + 1;
                Double emisora = am[i];
                System.out.println(a2 + ". " + emisora);
            }  
        } else if(a == true){
            System.out.println("\nFavoritas FM: \n");
            for (int j = 0; j < 6; j++){
                int b = j + 1;
                Double emisora2 = fm[j];
                System.out.println(b + ". " + emisora2);
        }
        }
    }

    public void estacionActual(Double a) {
        System.out.println("");
    }
    
}
