package TestesExceptions;

public class Exemplo1 {

    public void main(String[] args){
        try {
            int numero = Integer.parseInt("12a4");
            System.out.println("Entrada convertida para o tipo inteiro!");
        } catch (NumberFormatException e) {
            System.out.println(" A operação retornou o seguinte erro");
            System.out.println(e.getMessage());
        }
        System.out.println("Fim do programa");
    }
}
