package ar.edu.unju.edm.Ejercicio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("digite el numero como limite inferior: ");
            int limiteinferior=entrada.nextInt();

            System.out.println("digite el numero como limite superior: ");
            int limitesuperior=entrada.nextInt();

            System.out.println("quiere saber los numeros: 'PAR' o 'IMPAR'");
            String descripcion=entrada.next();

            Limites calcular = new Limites();
            calcular.hallarnumeros(limiteinferior, limitesuperior,descripcion);
        }
    }
}
