package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

import Modelo.Objeto;

public class Importar {

    public Queue<Objeto> ImportarArchivo() {

        String rutaArchivo = "Estudiantes.txt";
        Queue<Objeto> cola = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            Objeto obj = null;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("GUID:")) {

                    if (obj != null) {
                        cola.add(obj);
                    }

                    obj = new Objeto();

                    String guid = linea.substring(5).trim();
                    obj.setId(UUID.fromString(guid));

                } else if (linea.startsWith("TipoVehiculo:")) {

                    if (obj != null) {
                        obj.setTipoVehiculo(
                                Integer.parseInt(linea.substring(14).trim()));
                    }

                } else if (linea.startsWith("Marca:")) {

                    if (obj != null) {
                        obj.setMarca(linea.substring(6).trim());
                    }

                } else if (linea.startsWith("Color:")) {

                    if (obj != null) {
                        obj.setColor(linea.substring(6).trim());
                    }

                } else if (linea.startsWith("Valor:")) {

                    if (obj != null) {
                        obj.setValor(
                                Double.parseDouble(linea.substring(6).trim()));
                    }

                } else if (linea.startsWith("CedulaPropietario:")) {

                    if (obj != null) {
                        obj.setCedulaPropietario(
                                linea.substring(18).trim());
                    }

                } else if (linea.startsWith("NombrePropietario:")) {

                    if (obj != null) {
                        obj.setNombrePropietario(
                                linea.substring(18).trim());

                        cola.add(obj);
                        obj = null;
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");

        } catch (Exception e) {

            System.out.println("Error al importar el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        return cola;
    }
}
