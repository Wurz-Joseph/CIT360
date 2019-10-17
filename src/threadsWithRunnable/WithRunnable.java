package threadsWithRunnable;

public class WithRunnable {

	public static void main(String[] args) {
		
		//creates an anonymous runnable
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("Thread 1/Iteration: " + i);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}

				}

			}

		});
		
		//create a second anonymous runnable thread
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("Thread 2/Iteration: " + i);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}

				}

			}

		});
		
		//start the threads
		thread1.start();
		thread2.start();
	}

}