/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensaentornosgithubnetbeans;

import java.util.Objects;

/**
 *
 * @author Guido
 */
public class Coche {
    /**
    * Guarda la matrícula del coche
    */
    private String matricula;
    /**
    * Almacena el color del coche
    */
    private String color;
    /**
    * Guarda el modelo del coche
    */
    private String modelo;
    /**
    * Precio de compra
    */
    private int precio;

    public Coche(String matricula, String color, String modelo, int precio) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula
                + (this.color != null ? ", color: " + this.color : "")
                + (this.modelo != null ? ", modelo: " + this.modelo : "")
                + (this.precio != 0 ? ", precio: " + this.precio : "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void actualizarPrecio(int incremento) {
        this.precio += incremento;
    }
}
