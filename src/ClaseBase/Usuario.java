/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBase;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre;
    private String tipoDoc;
    private int id;

    public Usuario(String nombre, String tipoDoc, int id) {
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", tipoDoc=" + tipoDoc + ", id=" + id + '}';
    }

      
}
