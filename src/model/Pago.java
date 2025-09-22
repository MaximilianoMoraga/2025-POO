package model;

import java.time.LocalDate;

public class Pago {
    
    private int id;
    private double monto;
    private LocalDate fecha;
    private String metodo;

    public Pago() {
    }

    public Pago(int id, double monto, LocalDate fecha, String metodo) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Pago{" + "id=" + id + ", monto=" + monto + ", fecha=" + fecha + ", metodo=" + metodo + '}';
    }
    
    
    
    
    
}
