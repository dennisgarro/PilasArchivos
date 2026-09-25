package Controlador;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import Archivos.Exportar;
import Archivos.Importar;
import Modelo.Objeto;
import Validaciones.Validaciones;
import Vista.Metodos;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();
        Exportar e = new Exportar();
        Queue<Objeto> p = new LinkedList<>();
        Importar i = new Importar();
        p= i.ImportarArchivo();

        boolean continuar = true;
        while (continuar) {
            System.out.println("bienvenidos a la clase de Pilas(Nacho lee 2)");
            System.out.println("Que desea realizar");
            System.out.println("1) LLenar Datos ");
            System.out.println("2) Motrar Datos");
            System.out.println("3) Exportar ");
            System.out.println("4) ");
            System.out.println("5) Salir ");
            int opt = v.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    p = m.LLenarDatos(p);
                    break;
                case 2:
                    m.MostrarPila(p);
                    break;
                case 3:
                    e.exportarArchivo(p);
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
