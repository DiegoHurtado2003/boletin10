package Instrumentos;

enum Notas {DO, RE, MI, FA, SOL, LA, SI};

public abstract class Instrumento {

    public static int contadorNotas = 0;
    public static String[] notas = new String[100];

    /**
     * Método para añadir notas
     * @param nota nota a añadir
     */
    public abstract void add(int nota);

    /**
     * Método abastracto a definir en clases hijas
     */
    public abstract void interpretar();

}