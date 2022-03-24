package ejercicio1;

enum Tamano{MEDIANA, FAMILIAR}
public class Pizza extends  Pizzeria {

 Tamano tamano;
 public static int pizzasServidas=0;
    public static int pizzasPedidas=0;

    public Pizza(Tipo tipo, Tamano tamano) {
        super(tipo);
        this.tamano = tamano;
        pizzasPedidas++;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public void servir() {
        super.servir();
        pizzasServidas++;
    }

    @Override
    public String toString() {
        return "La pizza es: " +
                "del tamano= " + tamano +
                " del tipo= " + tipo +
                " con e estado =" + estado;
    }
}

