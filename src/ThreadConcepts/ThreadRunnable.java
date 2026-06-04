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
		Delta m1=new Delta();
		
		Thread t1=new Thread(m1);
		t1.start();
	}

}
