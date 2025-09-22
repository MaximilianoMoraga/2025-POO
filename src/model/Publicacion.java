package model;

import java.time.LocalDate;

public class Publicacion {

    private int id;
    private LocalDate fecha;
    private String portal;
    private String estado;

    public Publicacion() {
    }

    public Publicacion(int id, LocalDate fecha, String portal, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.portal = portal;
        this.estado = estado;
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

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id=" + id + ", fecha=" + fecha + ", portal=" + portal + ", estado=" + estado + '}';
    }
    
}
