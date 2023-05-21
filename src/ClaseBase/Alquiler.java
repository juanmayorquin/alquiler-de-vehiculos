/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBase;

import java.io.Serializable;
import java.time.LocalDate;


public class Alquiler implements Serializable{
    private int numReg, cantDias;
    private Usuario usuario;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio, fechaFin;
    private boolean pagado;
    private double valor;

    public Alquiler(int numReg, int cantDias, Usuario usuario, Vehiculo vehiculo) {
        this.numReg = numReg;
        this.cantDias = cantDias;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.fechaInicio = LocalDate.now();
        this.fechaFin = CalcularFechaFin();
        this.pagado = false;
        this.valor = CalcularValor();
    }

    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "numReg=" + numReg + ", cantDias=" + cantDias + ", usuario=" + usuario + ", vehiculo=" + vehiculo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", pagado=" + pagado + ", valor=" + valor + '}';
    }
    
    public LocalDate CalcularFechaFin(){
        return (this.fechaInicio.plusDays(this.cantDias));
    }
    
    public double CalcularValor(){
        return (this.cantDias * 130000);
    }
}
