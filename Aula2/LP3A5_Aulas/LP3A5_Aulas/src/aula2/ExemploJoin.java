package aula2;

public class ExemploJoin {

	public static void main(String[] args) {
		
		final Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1);
					System.out.println("NOVA THREAD");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("THREAD PRINCIPAL");

	}
}
