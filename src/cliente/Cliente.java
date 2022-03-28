package cliente;

import java.util.Objects;

public class Cliente {
    public String nombre, dni;
    public int edad;

    public Cliente(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Cliente( String dni) {
        this.dni = dni;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (!(objeto instanceof Cliente cliente)) return false;
        return getDni().equals(cliente.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    @Override//metodo toString() de la clase Cliente
    public String toString(){
        return "Dni: "+ dni + " Nombre: " + nombre + " Edad: " + edad +
"\n";}
}
