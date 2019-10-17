package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	
	private int id;

	public Processor(int id) {
		this.id = id;
	}

	public void run() {
		
		System.out.println("Starting: " + id);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println("Completed: " + id);

	}
}

public class Pool {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 6; i++) {
			executor.submit(new Processor(i));
		}
		//stops accepting new tasks, waits for submitted tasks to execute and terminates the executor
		executor.shutdown();

		System.out.println("All tasks submitted.");
		try {
			//blocks execution until all tasks have been completed
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {

		}
		System.out.println("All tasks completed.");
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime) / 1000;
		System.out.println("Time Elapsed: " + totalTime + " seconds");

	}

}
