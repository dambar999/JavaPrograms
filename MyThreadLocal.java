package Threads;

public class MyThreadLocal {
	ThreadLocal threadLocal = new ThreadLocal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadLocal local = new MyThreadLocal();
	
		local.test();
		

	}
	
	public  void test() {
		Thread t1= new Thread() {
			public void run() {
				
				threadLocal.set(3);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(threadLocal.get());
			}
		};
	
			Thread t2= new Thread() {
				public void run() {
					
					threadLocal.set(4);
					System.out.println(threadLocal.get());
				}
			};
			t1.start();
			t2.start();
			System.out.println(threadLocal.get());
	}

}
