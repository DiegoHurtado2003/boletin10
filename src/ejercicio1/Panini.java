package ejercicio1;

enum TamanoPanini{ALMERIA, GRANADA, SEVILLA}
enum Racion{DOBLE, SIMPLE}
public class Panini extends Pizzeria {

    TamanoPanini tamano;
    Racion racion;
    public static int paninisServidos=0;
    public static int paninisPedidos=0;



    public Panini(Tipo tipo, TamanoPanini tamano, Racion racion) {
        super(tipo);
        this.tamano = tamano;
        this.racion = racion;
        paninisPedidos++;
    }

    public TamanoPanini getTamano() {
        return tamano;
    }

    public void setTamano(TamanoPanini tamano) {
        this.tamano = tamano;
    }

    public Racion getRacion() {
        return racion;
    }

    public void setRacion(Racion racion) {
        this.racion = racion;
    }

    @Override
    public void servir() {
        super.servir();
        paninisServidos++;
    }


    public String toString() {
        return "El panini es:" +
                " de racion= " + racion +
                ", del tipo= " + tipo +
                ", del estado= " + estado;
    }
}
