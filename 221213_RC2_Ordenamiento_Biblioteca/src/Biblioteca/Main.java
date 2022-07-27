package Biblioteca;

import Biblioteca.models.Biblioteca;
import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    public static void main(String[] args) {
        biblioteca.registrarLibro();
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("---- MENU ----");
            System.out.println("1. Buscar libro");
            System.out.println("2. Consulta general");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    biblioteca.ordenarDatos();
                    biblioteca.buscarLibro();
                    break;
                case 2:
                    biblioteca.ordenarDatosMayoraMenor();
                    biblioteca.consultaGeneral();
                    break;
                default:
                    System.out.println("Bye Bye");
                    break;
            }
        }while(opcion != 3);
    }
}
