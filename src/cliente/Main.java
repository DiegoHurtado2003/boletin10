package cliente;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente("Diego","123456789W",9);
        Cliente cliente2=new Cliente("Alejandro","987654321W",19);
        Cliente cliente3=new Cliente("Álvaro","123555789W",99);
        Cliente cliente4=new Cliente("FRESCO","987654321X",199);
        Cliente cliente5=new Cliente("FRESCO00","987654321X",18);
        Cliente cliente6=new Cliente("PEPE","987894321X",18);
        ArrayList<Cliente> lista1=new ArrayList<>();
        lista1.add(cliente1);
        lista1.add(cliente2);

        lista1.remove(cliente2);

        lista1.add(cliente3);
        lista1.add(cliente4);
        lista1.add(cliente2);


        System.out.println(lista1.size());


        System.out.println("Cliente 5: "+lista1.contains(cliente5));
        System.out.println("Cliente 6: "+lista1.contains(cliente6));

        System.out.println("Cliente 1(constructor solo dni): "+lista1.contains(new Cliente("123456789W")));

        System.out.println(lista1.toString());
    }
}
