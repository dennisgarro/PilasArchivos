
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos {

    public Queue<ObjSancocho> LlenarCola(Queue<ObjSancocho> cola, Metodos m, Scanner sc) {
        boolean continuar = true;

        while (continuar) {
            ObjSancocho o = new ObjSancocho();
            o.setTurno(m.ValidarTurno(cola));
            o.setName(m.MenuComida(sc));
            System.out.println("Ingrese la cantidad ");
            o.setCantidad(sc.nextInt());
            System.out.println("Ingrese el precio ");
            o.setPrice(sc.nextDouble());
            o.setEstate(0);
            System.out.println("Desea Agregar mas turnos 1 si , 2 no ");
            int opt = sc.nextInt();
            if (opt == 2) {
                System.out.println("Vuelve Pront");
                continuar = false;
            }
            cola.offer(o);

        }
        return cola;

    }

    public int ValidarTurno(Queue<ObjSancocho> cola) {
        int turno = 0;
        if (cola.isEmpty()) {
            turno = 1;
        } else {
            turno = cola.size();
        }
        return turno;
    }

    public int MenuComida(Scanner sc) {
        System.out.println("1) Sacocho de bagre");
        System.out.println("2) sacocho trifasico");
        System.out.println("3) Ajiaco");
        System.out.println("4) Consome de Pollo");
        System.out.println("5) Sancocho de costilla ");
        System.out.println("6) Mondongo de la abuela ");
        return sc.nextInt();

    }

}
