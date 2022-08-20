package aula2;

class NovaThread extends Thread {
	public void run() {
		System.out.println("Sou uma nova thread " + this.getName() );
	}
	
	public static void main(String[] args) {
//		System.out.println("Estamos na: " + Thread.currentThread().getName());
//		Thread thread = new NovaThread();
//		thread.start();
		
		class HelloParalelo implements Runnable {
			public void run() {
				System.out.println("Hello world paralelo! obs: inner class");
				System.out.println("Sou a thread " + Thread.currentThread().getName());
			 }
			}
		
			Thread t1 = new Thread(new HelloParalelo());
			t1.start();
			System.out.println("Thread principal: " + Thread.currentThread().getName());
		
	}
	
}
