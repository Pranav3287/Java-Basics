package ThreadConcepts;

class Game extends Thread{
	void prinatble(int n) {
		synchronized (this) {
			for(int i=0;i<=n;i++) {
				System.out.println(n*i);
			}
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.getMessage();
			}
		}
	}
}
class GameDemo extends Thread{
	Game g2;
	GameDemo(Game g2){
		this.g2=g2;
	}
	public void run() {
		g2.prinatble(2);
	}
}
class Gameplay extends Thread{
	Game g3;
	Gameplay(Game g3){
		this.g3=g3;
	}
	public void run() {
		g3.prinatble(3);
	}
}
public class SynchronizedEx {

		public static void main(String[] args) {
			Game g1 =new Game();
			GameDemo h= new GameDemo(g1);
			Gameplay f= new Gameplay(g1);
			
			h.start();
			f.start();
		}

}
