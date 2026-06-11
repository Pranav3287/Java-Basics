package ThreadConcepts;

class Mythread extends Thread{
	public void run(){
		System.out.println("Thread is Runing...");
		game(5);
	}
	void game(int n) {
		for(int i=0;i<=n;i++) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.getMessage();		
			}
			System.out.println(i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		Mythread t1=new Mythread();
		t1.start();

	}

}
