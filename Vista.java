public class Vista {
    public Vista(){}
    public void Menu(){
        System.out.println("");
        System.out.println("     MENU ");
        System.out.println("1. Prender/Apagar radio ");
        System.out.println("2. Cambio AM/FM ");
        System.out.println("3. Avanzar");
        System.out.println("4. Retroceder");
        System.out.println("5. Guardar emisora");
        System.out.println("6. Favoritas");
        System.out.println("7. Salir del programa.");
    }

    public void Mostrar_Estado(boolean a){
        if (a == false){
            System.out.println("La radio está apagado.");
        } else if (a == true){
            System.out.println("La radio está prendida.");
        }
    }

    public void Mostrar_Estacion(boolean a){
        if (a == false){
            System.out.println("La radio se encuentra en AM.");
        } else if (a == true){
            System.out.println("La radio se encuentra en FM.");
        }
    }

    public void Favoritas(double[] am, double[] fm, boolean a){
        if (a == false){
            System.out.println("  Favoritas AM: ");
            for (int i = 0; i < 6; i++){
                int a = i +1;
                double emisora = am[i];
                System.out.println(a + ". " + emisora );
            }

        } else if (a == true){
            System.out.println("");
            System.out.println("  Favoritas FM: ");
            for (int j = 0; j < 6; j++){
                int b = j +1;
                double emisora2 = fm[j];
                System.out.println(b + ". " + emisora2 );
    
            }
        }
        
    }

    public void Estacion_actual(double a){
        System.out.println("");
        System.out.println("Te encuentras en la estacion: " + a);
    }
}
