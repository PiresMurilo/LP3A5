package aula3;

import java.util.Date;

public class Produtor implements Runnable {
    FilaMensagens msgQueue = new FilaMensagens();
    public Produtor(FilaMensagens msg){
        msgQueue = msg;
    }

    //Execução da Thread
    public void run() {
        while(true) {
            Date message = new Date();
            msgQueue.send(message);
        }
    }

}
