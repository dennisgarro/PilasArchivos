package Controlador;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("bienvenidos a la clase de Pilas(Nacho lee 2)");
            System.out.println("Que desea realizar");
            System.out.println("1)  ");
            System.out.println("2) ");
            System.out.println("3)  ");
            System.out.println("4) ");
            System.out.println("5) Salir ");
            int opt = m.ValidarEentero(sc);
            switch (opt) {
                case 1:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 2:
                   System.out.println("Pagina en mantenimiento");
                    break;
                case 3:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 4:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esta opcion no existe");
                    break;
            }
        }
    }
}

