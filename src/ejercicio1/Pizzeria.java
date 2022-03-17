package ejercicio1;

enum Tipo{MARGARITA, FUNGUI, CUATROESTACIONES}
enum Estado{PEDIDA, SERVIDA}

public class Pizzeria {

    //Constructores
    protected Tipo tipo;
    protected Estado estado;
    protected static int totalPizzas=0;
    protected static int contadorServidas=0;

    public Pizzeria() {totalPizzas++;}

    public Pizzeria(Tipo tipo) {
        this.tipo = tipo;
        this.estado = Estado.PEDIDA;
    }


    //Getter y setter
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    //metodos

    protected void servir(){
        this.estado=Estado.SERVIDA;
        contadorServidas++;
    }


    @Override
    public String toString() {
        return "Del tipo "+tipo+", del  estado"+ estado;
    }
}

