package ejercicio1;

public class Pizzeria {


    public Tipo tipo;
    public Estado estado;
    public static int total=0;
    public static int contadorServidas=0;

//Constructores

    public Pizzeria(Tipo tipo) {
        this.tipo = tipo;
        this.estado = Estado.PEDIDA;
        total++;
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

    public void servir(){
        this.estado=Estado.SERVIDA;
        contadorServidas++;
    }


    @Override
    public String toString() {
        return "Del tipo "+tipo+", del  estado"+ estado;
    }
}

