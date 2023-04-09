package ar.edu.unju.edm.Ejercicio2;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("digame el numero de un mes del año: ");
            int mounth = entrada.nextInt();

            Mes Calcular = new Mes();
            Calcular.CalcularMes(mounth);
        }
    }
}
