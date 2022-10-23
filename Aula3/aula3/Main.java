package aula3;

public class Main {
    public static void main(String args[]){
        Buffer BF = new Buffer();
        BF.insert("Professor eu só quero passar");
        BF.insert(":D");
        BF.showBufferData();

        BF.remove(); //Remove o que está na última posição do buffer, no caso, ":D"
        BF.remove(); //Remove o que está na última posição do buffer, nesse caso, "Professor eu só quero passar", já que o dado anterior já foi removido
        BF.showBufferData();

        BF.insert("Tarefa 2 de LP3A5 concluída");
        String itemRemovido = (String) BF.remove(); //Armazenando o último dado removido do buffer
        System.out.println("\nÚltimo dado removido: \n" + itemRemovido);

    }
}
