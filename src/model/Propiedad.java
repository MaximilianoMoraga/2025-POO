package model;

public class Propiedad {
    private int id;
    private String codigo;
    private String tipo;
    private String direccion;
    private double precio;
    private String estado;

    public Propiedad() {
    }

    public Propiedad(int id, String codigo, String tipo, String direccion, double precio, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.precio = precio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "id=" + id + ", codigo=" + codigo + ", tipo=" + tipo + ", direccion=" + direccion + ", precio=" + precio + ", estado=" + estado + '}';
    }
    
    
    
}
