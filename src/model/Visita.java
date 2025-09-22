package model;

import java.time.LocalDate;

public class Visita {
    
    // almendra +5
    private int id;
    private LocalDate fecha;
    private String comentario;

    public Visita() {
    }

    public Visita(int id, LocalDate fecha, String comentario) {
        this.id = id;
        this.fecha = fecha;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Visita{" + "id=" + id + ", fecha=" + fecha + ", comentario=" + comentario + '}';
    }
    
    
}
