package ThreadConcepts;
class Loading extends Thread{
	public void run() {
		time(50);
	}
	void time(int n) {
		for(int i=10;i<=n;i++) {
			if(i%10==0) {
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.getMessage();				
				}
			System.out.println("Downloading in this sec ..."+i+" for "+Thread.currentThread().getName());
			}
		}
	}
}
public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		Loading l1=new Loading();
		Loading l2=new Loading();
		Loading l3=new Loading();
		Loading l4=new Loading();
		
		l1.setName("Java 1");
		l2.setName("Java 2");
		l3.setName("Java 3");
		l4.setName("Java 4");
		
		l1.setPriority(1);
		l2.setPriority(10);
		l3.setPriority(4);
		l4.setPriority(7);
		
		l1.start();
		l2.start();
		l3.start();
		l4.start();
	}

}
