package ar.edu.unju.edm.Ejercicio5;
import java.util.Scanner;


public class Trabajadores {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {

            Empleado empleado1 = new Empleado();
            System.out.println("Digame el nombre del 1er empleado: ");
            String nombre=entrada.next();
            empleado1.SetNombre(nombre);

            System.out.println("Digame el legajo: ");
            int legajo=entrada.nextInt();
            empleado1.setLegajo(legajo);

            System.out.println("Digame el email: ");
            String email=entrada.next();
            empleado1.setEmail(email);

            System.out.println("Digame la fecha de ingreso: ");
            String fecha = entrada.next();
            empleado1.setFecha(fecha);

            System.out.println("Digame cuantas horas trabajo: ");
            int horas=entrada.nextInt();
            empleado1.setHorasTrabajadas(horas);

            System.out.println("Digame el nombre del 2do empleado: ");
            nombre=entrada.next();

            System.out.println("Digame su numero de legajo: ");
            legajo=entrada.nextInt();

            System.out.println("digame cuantas horas trabajo: ");
            horas=entrada.nextInt();

            Empleado empleado2 = new Empleado(nombre,legajo,horas); 

            empleado1.MostrarDatos();

            System.out.println
            ("Empleado... \n Nombre: " + empleado2.getNombre(nombre) +
             "\n Legajo: "+ empleado2.getLegajo(legajo) +
             "\n Horas trabajadas: " + empleado2.getHorasTrabajadas(horas) +
             "\n Sueldo: " + empleado2.getSueldo(horas));
        }

    }
}
