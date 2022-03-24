package ArrayTostring;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static int[] array1={1,4,54,74,64,65,852,7};
    public static int[] array2={1,4,54,74,64,65,852,9};
    public static int[] array3={1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {

        //Imprimir los valores del array

        System.out.println(Arrays.toString(array1));

        //Rellenar
        Arrays.fill(array1,999);
        System.out.println("Inicializo mi tabla a valor 99");
        System.out.println(Arrays.toString(array1));


        Arrays.fill(array1,0,3,7);
        System.out.println("relleno tabla con otros datos");
        System.out.println(Arrays.toString(array1));

        //Comparar
        System.out.println("¿Los array 1 y dos son iguales?(True o False): "+Arrays.equals(array1,array2));

        //Algoritmo de busqueda(Tienen que estar previamente ordenados)
        System.out.println(Arrays.binarySearch(array3,9));
        System.out.println(Arrays.binarySearch(array3,90));

        char[] char1={'a','b','c','d','e','f','g','i','j'};
        System.out.println("La letra e se encuentra en la posición: "+Arrays.binarySearch(char1,'e'));


        System.out.println("La letra h habría que ponerla en la posición: "+(-Arrays.binarySearch(char1,'h')-1));

        //Añadimos un valor en mitad del array
        char[] char2=Arrays.copyOf(char1,char1.length+10);
        //rellenamos el array para que no de fallo
        Arrays.fill(char2, char1.length, char2.length,'~');
        Arrays.sort(char2);

        //Buscamos la posición de la h
        int posicion=(-Arrays.binarySearch(char2,'h')-1);


        for(int indice=char1.length;indice>posicion;indice--){
           char2[indice]=char1[indice-1];
        }
        char2[posicion]='h';

        System.out.println(Arrays.toString(char2));


        char[] char3=Arrays.copyOf(char1,char1.length-1);
        int posicion2=(Arrays.binarySearch(char2,'a'));

        if (posicion2>=0){
            for(int indice=posicion2;indice<char1.length;indice++){
                if (indice!=char1.length-1){
                    char3[indice]=char1[indice+1];
                }
            }
        }
        else System.out.println("La letra a no está en el array");

        System.out.println(Arrays.toString(char3));
    }
}
