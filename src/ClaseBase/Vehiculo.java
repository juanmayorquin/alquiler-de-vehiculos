/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBase;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    private String marca;
    private String color;
    private int year;
    private String placa;
    private boolean disponible;

    public Vehiculo(String marca, String color, int year, String placa) {
        this.marca = marca;
        this.color = color;
        this.year = year;
        this.placa = placa;
        this.disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return color;
    }

    public void setModelo(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + ", year=" + year + ", placa=" + placa + ", disponible=" + disponible + '}';
    }
}
