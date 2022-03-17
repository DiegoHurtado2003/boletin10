package ejercicio1;

public class Main {

    public static void main(String[] args) {
	// se ofrecen las tres pizzas

        Pizza pizza1=new Pizza(Tipo.CUATROESTACIONES, Tamano.FAMILIAR);
        Pizza pizza2=new Pizza(Tipo.FUNGUI, Tamano.MEDIANA);
        Pizza pizza3=new Pizza(Tipo.MARGARITA, Tamano.FAMILIAR);

        Panini panini1=new Panini(Tipo.MARGARITA, TamanoPanini.ALMERIA, Racion.DOBLE);
        Panini panini2=new Panini(Tipo.CUATROESTACIONES, TamanoPanini.SEVILLA, Racion.SIMPLE);

        //vamos a dos pizzas y un panini
        pizza1.servir();
        pizza2.servir();
        panini2.servir();

        //Método mostrar pedidos
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(panini1);
        System.out.println(panini2);
        System.out.println("El total de pizzas pedidas es: "+ Pizza.contadorServidas+
                " y el total  de pizzas servidas es: "+Pizza.totalPizzas);

        System.out.println("El total de paninis pedidos es: "+ Panini.contadorServidas+
                " y el total  de paninis servidos es: "+Panini.paninisServidos);
    }
}
