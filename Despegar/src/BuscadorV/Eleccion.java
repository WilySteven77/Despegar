package BuscadorV;

public class Eleccion implements Buscar{
    public void EB(String Bus){
        if (Bus == "Vuelo"){
            System.out.println("Tenemos dos opciones de Vuelos");
        }
        else
        {
            System.out.println("Tenemos dos opciones de Hoteles");
        }
    }
}
