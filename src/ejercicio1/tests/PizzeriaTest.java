package ejercicio1.tests;

import ejercicio1.Pizza;
import ejercicio1.Pizzeria;
import ejercicio1.Tipo;

import static org.junit.jupiter.api.Assertions.*;

class PizzeriaTest {


    @org.junit.jupiter.api.Test
    void servir() {
        int contadorAntes=Pizzeria.contadorServidas;
        Pizzeria pizza1=new Pizzeria(Tipo.FUNGUI);
        pizza1.servir();
        assertEquals(pizza1.estado, pizza1.getEstado(), "Fallo");
        assertEquals(contadorAntes+1,Pizzeria.contadorServidas,"Fallo");
    }


}