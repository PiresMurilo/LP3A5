package tarefa3;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args){

        ForkJoinPool pool = new ForkJoinPool(); //Pool de Threads Fork-Join

        int[] vector = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4}; //Vetor desordenado
        System.out.println("DESORDENADO -> " + arrayToString(vector));

        QuicksortForkJoin quicksortUso = new QuicksortForkJoin(vector); //Efetuando Fork-Join para ordenar o vetor
        pool.invoke(quicksortUso); //Execução da tarefa utilizando o pool
        System.out.println("\nApós Fork-Join: \n");
        System.out.println("ORDENADO -> " + arrayToString(vector));

    }

    //método auxiliar para impressão dos vetores
    private static String arrayToString(int[] array){
        String aux = "[" + array[0];
        for (int i = 1; i < array.length; i++){
            aux += ", " + array[i];
        }
        return aux + "]";
    }
}
