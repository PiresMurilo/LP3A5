package aula2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread principal = Thread.currentThread();
		System.out.println("Nome da thread: " + principal.getName());
		System.out.println("Thread.toString(): " + principal);
	}

}
