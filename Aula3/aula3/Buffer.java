package aula3;

public class Buffer {
    private static final int BUFFER_SIZE = 5; //Especificação do tamanho do buffer
    private int count; //Contador de itens no buffer
    private int in; //Mostra a próxima posição disponível
    private int out; //Mostra a próxima posição ocupada
    private Object[] buffer;

    public Buffer() {
        count = 0;
        in = 0;
        out = 0;
        buffer = new Object[BUFFER_SIZE];
    }

    //Método de inserção de informação no buffer
    public void insert(Object item) {
        while(count == BUFFER_SIZE);  //Buffer cheio, nada deve ser inserido
        ++count; //Caso não esteja cheio, incrementará o número de itens no buffer
        buffer[in] = item; //Informação será adicionada no buffer, na próxima posição disponível
        in = (in + 1) % BUFFER_SIZE;
    }

    //Método para exibir o que tem no buffer (teste)
    public void showBufferData() {
        System.out.println("\nDADOS NO BUFFER:");
        if (count == 0)
            System.out.println("Não há dados no buffer!");

        for (int i = 0; i < count; i++)
            System.out.println(buffer[i].toString());
    }

    //Remove a última posição do buffer
    public Object remove() {
        Object item;
        while(count == 0); //Buffer vazio, não há o que fazer
        --count; //Diminui o número de itens no buffer
        item = buffer[out]; //Armazena o que foi removido
        out = (out + 1) % BUFFER_SIZE;
        return item; //Retorna o dado que foi removido
    }
}
