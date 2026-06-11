package ThreadConcepts;


class Download extends Thread{
	public void run() {
		time(100);
	}
	void time(int n) {
		for(int i=10;i<=n;i++) {
			if(i%10==0) {
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.getMessage();				
				}
			System.out.println("Downloading in this sec ..."+i+" for "+Thread.currentThread().getName());
			}
		}
	}
}
public class ThreadSleepDemo {

	public static void main(String[] args) {
			Download d1=new Download();
			Download d2=new Download();
			d1.start();
			
			try {
				d1.join(1500);
			}catch(Exception e) {
				e.getMessage();
			}
			d2.start();
	}

}
