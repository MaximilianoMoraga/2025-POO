package model;

import java.time.LocalDate;

public class Contrato {
    
    private int id;
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private double monto;

    public Contrato() {
    }

    public Contrato(int id, String tipo, LocalDate fechaInicio, LocalDate fechaFinal, double monto) {
        this.id = id;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", tipo=" + tipo + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", monto=" + monto + '}';
    }
    
}
