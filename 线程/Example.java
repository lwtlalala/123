public class Example {
	public static void main(String[]args) {
	MyThread myThread=new MyThread();
	myThread.start();
	while(true) {
		System.out.println("你的名字");
		
	}
	}

}
class Mythread extends Thread{
	public void run() {
		while(true) {
		System.out.println("未闻花名");
		}
	}
}