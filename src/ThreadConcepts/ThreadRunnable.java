package ThreadConcepts;

class Delta implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String s="Pranav is Running..";
		System.out.println(s);
	}
}
public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delta m1=new Delta();//call the Delta class by creating the object
		
		Thread t1=new Thread(m1);//putting the object refer variable into the thread class
		t1.start();// Stating the thread 
	}
}
