package aula3;

import java.util.Date;
public class Consumidor implements Runnable {
    FilaMensagens msgQueue = new FilaMensagens();

    public Consumidor(FilaMensagens msg){
        msgQueue = msg;
    }

    //Execução da Thread
    public void run() {
        while(true) {
            Date message = (Date) msgQueue.receive();
            if (message != null)
                System.out.println(message.toString());
        }
    }
}
