package ar.edu.unju.edm.Ejercicio3;

public class Numero {
    public void CalcularPrimo(int num){

        for(int i=2;i<num;i++){
            int creciente=2;
            boolean esprimo=true;

            while(esprimo && creciente<i){

                if (i % creciente == 0){
                    esprimo=false;
                }
                else
                    creciente++;
            }
            if(esprimo){
                System.out.println(i+" :es primo");
            }

        }
    }
}
