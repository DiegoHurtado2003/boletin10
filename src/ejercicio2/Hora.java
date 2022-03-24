package ejercicio2;

public class Hora {
    //Atributos
    protected int horas;
    protected int minutos;

    //Constructores


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        } else System.out.println("Hora inválida, objeto creado con hora=0.");
    }

    public int getMinutos() {
        return minutos;

    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else System.out.println("Minuto inválido, objeto creado con minuto=0.");
    }


    //Métodos

    //Método para comprobar hora


    //Método incremento(1 minuto)
    public void Inc() {
        this.minutos++;
        if (this.minutos > 59) {
            this.horas++;
            this.minutos = 0;

            if (this.horas > 23) {
                this.horas = 0;
            }

        }
        }

        //Método toString


        @Override
        public String toString () {
            return "Son las " + horas + ":" + minutos;

        }
    }

