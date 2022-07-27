package Biblioteca.models;

import java.util.Scanner;
public class Biblioteca {
    public Libro listaLibro[] = new Libro[10];
    public Libro aux;
    public void registrarLibro(){
        listaLibro[0] = new Libro("Computacion Desde Cero", 1597, "Computacion");
        listaLibro[1] = new Libro("Moby-Dick", 3456, "Literatura");
        listaLibro[2] = new Libro("El hombre anumerico", 4679, "Matematicas");
        listaLibro[3] = new Libro("Cronicas Marcianas", 3168, "Ficcion");
        listaLibro[4] = new Libro("Viajes con Heródoto", 7988, "Viajes");
        listaLibro[5] = new Libro("Estructura y diseño de computadores", 9418, "Computacion");
        listaLibro[6] = new Libro("Cumbres borrascosas", 5041, "Literatura");
        listaLibro[7] = new Libro("Un mundo feliz", 2457, "Ficcion");
        listaLibro[8] = new Libro("En el antipodas", 7427, "Viajes");
        listaLibro[9] = new Libro("Guía del autoestopista",8909, "Ficcion");
    }
    public void buscarLibro(){
        String categoria;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la categoria: ");
        categoria = entrada.next();
        vizualizarLibro(categoria);
    }

    private void vizualizarLibro(String categoria) {
        System.out.println("Libro(s) encontrado(s)");
        System.out.println("Informacion");
        for (int i=0; i<listaLibro.length; i++){
            if(categoria.equals(listaLibro[i].getCategoria())){
                System.out.println("Nombre: " + listaLibro[i].getNombre());
                System.out.println("Id: " + listaLibro[i].getId());
            }
        }
    }

    public void ordenarDatos(){
        for(int i=0; i < listaLibro.length; i++){
            for (int j=i+1; j < listaLibro.length; j++){
                if (listaLibro[i].getId() > listaLibro[j].getId()){
                    aux = listaLibro[i];
                    listaLibro[i] = listaLibro[j];
                    listaLibro[j] = aux;
                }
            }
        }
    }
    public void consultaGeneral(){
        System.out.println("Libros ordenados de mayor a menor");
        for (int i=0; i< listaLibro.length; i++){
            System.out.println("Nombre: " + listaLibro[i].getNombre());
            System.out.println("Id: " + listaLibro[i].getId());
        }
    }

    public void ordenarDatosMayoraMenor(){
        for(int i=0; i < listaLibro.length; i++){
            for (int j=i+1; j < listaLibro.length; j++){
                if (listaLibro[i].getId() < listaLibro[j].getId()){
                    aux = listaLibro[i];
                    listaLibro[i] = listaLibro[j];
                    listaLibro[j] = aux;
                }
            }
        }
    }
}
