package threadLock;
public class Lock {
	private int count = 0;
	
	//use a synchronized lock to keep ensure count is incremented accurately
	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) {
		//create new lock object
		Lock lock = new Lock();
		
		//call the doWork() method with a lock
		lock.doWork();

	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}

			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
		}
		
		
		System.out.println("count is: " + count);

	}

}
