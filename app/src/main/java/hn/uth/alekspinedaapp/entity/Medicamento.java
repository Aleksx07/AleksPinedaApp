package hn.uth.alekspinedaapp.entity;

public class Medicamento {
    private String nombre;
    private String costo;
    private String componente;

    public Medicamento(String nombre, String costo, String componente) {
        this.nombre = nombre;
        this.costo = costo;
        this.componente = componente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }
}
