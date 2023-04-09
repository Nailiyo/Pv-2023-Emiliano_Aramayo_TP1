package ar.edu.unju.edm.Ejercicio4;

public class Limites {
    public void hallarnumeros(int limI, int limS, String desc){

        if(limI>=limS){
            System.out.println("el limite inferior es mas grande que el limite superior");
        }
        else{
        limI++;
            switch(desc){
                case "PAR":
                while(limI<limS){
                    if(limI % 2 == 0){
                        System.out.println(limI);
                    }
                    limI++;
                }
                break;

                case "IMPAR":
                while(limI<limS){

                    if(limI % 2 != 0){
                        System.out.println(limI);
                    }
                    limI++;
                }
                break;
                default: System.out.println("solo admitimos la cadena 'PAR' o 'IMPAR'");
                break;
            }
        }
    }
}
