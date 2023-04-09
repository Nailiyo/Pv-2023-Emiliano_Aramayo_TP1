package ar.edu.unju.edm.Ejercicio3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("digite un numero maximo para saber los numeros primos menores a el: ");
            int num= entrada.nextInt();
            Numero calcular = new Numero();

            calcular.CalcularPrimo(num);
        }

    }
    
}
