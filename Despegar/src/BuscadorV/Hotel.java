package BuscadorV;

public abstract class Hotel{
    private int Dinero;
    public Hotel(int Dinero){
        this.Dinero = Dinero;
    }
    public int getPrecio(){ return this.Dinero;}
    public abstract String getName();
}
