package Biblioteca.models;

public class Libro {
    private String nombre;
    private int id;
    private String categoria;
    public Libro(String nombre, int id, String categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.id = id;
    }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public int getId() { return id; }
}
