package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.UUID;

import Modelo.Objeto;

public class Exportar {
    public void exportarArchivo(Queue<Objeto> p) {
        if (p.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Estudiantes.txt")) {
                for (Objeto obj : p) {
                    e.write("GUID: " + obj.getId() + "\n");
                    e.write("TipoVehiculo: " + obj.getTipoVehiculo() + "\n");
                    e.write("Marca: " + obj.getMarca() + "\n");
                    e.write("Color: " + obj.getColor() + "\n");
                    e.write("Valor: " + obj.getValor() + "\n");
                    e.write("CedulaPropietario: " + obj.getCedulaPropietario() + "\n");
                    e.write("NombrePropietario: " + obj.getNombrePropietario() + "\n");

                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
