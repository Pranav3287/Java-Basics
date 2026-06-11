package ThreadConcepts;

class Delta implements Runnable{

	@Override
	public void run() {
		String s="Pranav is Running..";
		System.out.println(s);
		table();
	}
	void table() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadRunnable {

	public static void main(String[] args) {

		Delta m1=new Delta();//call the Delta class by creating the object
		
		Thread t1=new Thread(m1);//putting the object refer variable into the thread class
		
		t1.start();// Stating the thread 
		try {
			t1.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
