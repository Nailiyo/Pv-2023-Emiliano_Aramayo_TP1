package ar.edu.unju.edm.Ejercicio1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) throws Exception {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("digame el año: ");
            int year = entrada.nextInt();

            if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){

                System.out.println(year+" : es año bisiesto");
            }

            else{
                System.out.println(year+" : no es año bisiesto");
            }
        }
    }
}

