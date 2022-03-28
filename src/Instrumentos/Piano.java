package Instrumentos;


    enum NotasPiano {PRAM, PREM, PRIM, PROM, PRUM, TAN, TUN};

    public class Piano extends Instrumento {

        public static int contadorNotas = 0;
        public static String[] notas = new String[100];

        /**
         * Comprueba que hay espacio en el array para introducir una nueva nota
         *
         * @return devuelve un booleano que nos dirá si podemos introducir una nueva nota
         */
        public boolean Espacio() {
            boolean error = false;
            for (String k : notas) {
                if (k == null) {
                    error = true;
                    break;
                }
            }
            return error;
        }

        /**
         * Añade una nota al array
         * @param nota añade una nota
         */

        @Override
        public void add(int nota) {
            if (Espacio()) {
                switch (nota) {
                    case 1 -> {
                        notas[contadorNotas]=NotasPiano.PRAM.toString();
                        contadorNotas++;
                    }
                    case 2 -> {
                        notas[contadorNotas]=NotasPiano.PREM.toString();
                        contadorNotas++;
                    }
                    case 3 -> {
                        notas[contadorNotas]=NotasPiano.PRIM.toString();
                        contadorNotas++;
                    }
                    case 4 -> {

                        notas[contadorNotas]=NotasPiano.PROM.toString();
                        contadorNotas++;
                    }
                    case 5 -> {
                        notas[contadorNotas]=NotasPiano.PRUM.toString();
                        contadorNotas++;
                    }
                    case 6 -> {
                        notas[contadorNotas]=NotasPiano.TAN.toString();
                        contadorNotas++;
                    }
                    case 7 -> {
                        notas[contadorNotas]=NotasPiano.TUN.toString();
                        contadorNotas++;
                    }
                    case 8 -> {
                        System.out.println("Programa finalizado");
                    }
                    default -> System.out.println("Nota inválida");
                }

            }
        }

        /**
         * Este método escribe por pantalla las notas que el instrumento va a tocar
         */
        @Override
        public void interpretar() {
            for (String k : notas) {
                if (k != null) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }


    }

