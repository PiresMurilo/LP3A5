package tarefa3;

import java.util.concurrent.RecursiveAction;

public class QuicksortForkJoin extends RecursiveAction {
    private int[] vector; //Vetor desordenado
    private int init; //Índice de início
    private int end; //Índice de término

    //Ordena o subArray do índice "init" até "end"
    public QuicksortForkJoin(int[] vector, int init, int end){
        this.vector = vector;
        this.init = init;
        this.end = end;
    }

    //Ordena o vetor por completo
    public QuicksortForkJoin(int[] vector){
        this(vector, 0, vector.length - 1);
    }

    //Executa o Quicksort com o Fork-Join de forma paralela. Obs: compute() é um método sobrescrito da classe RecursiveAction
    @Override
    protected void compute() {
        if(init < end){
            int q = partition(vector, init, end); //Obtenção do pivô (join)
            invokeAll(new QuicksortForkJoin(vector, init, q - 1), //Chamadas recursivas paralelamente (fork)
                    new QuicksortForkJoin(vector, q + 1, end));
        }
    }

    //Método de partição
    private static int partition(int[] A, int init, int end){
        int pivo = A[init]; //Pega o elemento inicial como pivô
        int i = init + 1; //Índice i percorre o vetor da esquerda para a direita
        int j = end; //Índice j percorre o vetor da direita para a esquerda

        //Loop é interrompido quando os índices se ultrapassam
        while(i <= j){
            // Primeiro loop: interrompe quando encontrar algum elemento à esquerda que seja MAIOR que o pivô, haja vista que ele deveria estar do lado direito da partição
            while(i <= j && A[i] <= pivo){
                i = i + 1;
            }

            //Segundo loop: interrompe quando encontrar algum elemento à direita que seja MENOR ou IGUAL ao pivô, haja vista que ele deveria estar do lado esquerdo da partição
            while(i <= j && A[j] > pivo){
                j = j - 1;
            }

            if(i < j){
                swap(A, i, j); //Troca os índices de posição caso eles são se ultrapassem
            }
        }

        swap(A, init, j); //Pivô é colocado na posição de ordenação
        return j; //Retorna a posição do pivô
    }

    //Método auxiliar para efetuar a troca de elementos
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}