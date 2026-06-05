package ThreadConcepts;
class Account{
	public int salary=30000;
	int amount;
	synchronized void withrow(int amount) {
		if(salary>=amount) {
			System.out.println(salary);
		}else {
			System.out.println(amount);
		}
	}
}
class SBI extends Account{
	int remaining(int amount) {
		if(amount<salary) {
			salary -= amount;
		}
		return salary;
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account a=new Account();
		//a.withrow(20000);
		SBI b=new SBI();
		System.out.println(b.remaining(200));
	}
}
