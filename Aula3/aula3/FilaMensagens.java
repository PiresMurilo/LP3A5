package aula3;

import java.util.*;
public class FilaMensagens {
    private Vector queue;
    public FilaMensagens(){
        queue = new Vector();

    }

    //Método para enviar a mensagem
    public void send(Object item) {
        queue.addElement(item);
    }

    //Método para receber a mensagem
    public Object receive() {
        if(queue.size() == 0)
            return null;
        else
            return queue.remove(0); //Aqui retorna a mensagem e a remove, passando para a próxima mensagem da fila
    }

}
