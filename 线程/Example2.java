public class Example2 {
	public static void main(String[] args) {
		MYThread myThread=new MYThread();
		Thread thread=new Thread(myThread);
		thread.start();
		for(int i=1;i<101;i++) {
			System.out.println("main");
			
		}
		}
		}

	class MYThread implements Runnable{
		public void run() {
			for(int i=1;i<51;i++) {	
			System.out.println("New");
		}
}
	}
