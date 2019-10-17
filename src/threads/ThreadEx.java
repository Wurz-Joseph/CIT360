package threads;

class ThreadEx extends Thread {
	// for the thread to execute code it has to me inside the run method
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Hello, iteration #" + i);

			try {
				//sleep throws exception which has to be caught
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}

	public static void main(String[] args) {
		// creating 3 threads to run the above code concurrently
		ThreadEx Thread1 = new ThreadEx();
		ThreadEx Thread2 = new ThreadEx();
		ThreadEx Thread3 = new ThreadEx();
		
		//required to start the thread
		Thread1.start();
		Thread2.start();
		Thread3.start();

	}
}
