package ejercicio1;

enum Tamano{MEDIANA, FAMILIAR}
public class Pizza extends  Pizzeria {

 Tamano tamano;
 public static int pizzasServidas=0;

    public Pizza(Tipo tipo, Tamano tamano) {
        super(tipo);
        this.tamano = tamano;
        pizzasServidas++;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "La pizza es: " +
                "del tamano= " + tamano +
                "del tipo= " + tipo +
                "con e estado =" + estado;
    }
}

