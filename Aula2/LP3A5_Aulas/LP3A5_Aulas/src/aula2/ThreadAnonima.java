package aula2;

public class ThreadAnonima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world anonimous class!");
			}
		});
		
		t1.start();
		System.out.println("Thread principal: " + Thread.currentThread().getName());
	}
}
