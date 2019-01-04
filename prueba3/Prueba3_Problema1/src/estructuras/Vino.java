/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author rol
 */
public class Vino {

    private String pais;
    private String descripcion;
    private double precio;
    private String titulo;
    private String variedad;
    private String vinedo;

    public Vino(String pais, String descripcion, double precio, String titulo, String variedad, String vinedo) {
        this.pais = pais;
        this.descripcion = descripcion;
        this.precio = precio;
        this.titulo = titulo;
        this.variedad = variedad;
        this.vinedo = vinedo;
    }

    public String getPais() {
        return pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getVinedo() {
        return vinedo;
    }

    @Override
    public String toString() {
        return "País: " + pais + "\nDescripción: "
                + descripcion + "\nPrecio: " + precio
                + "\nTitulo: " + titulo + "\nVariedad: " + variedad + "\nViñedo: " + vinedo+"\n\n";

    }

}
