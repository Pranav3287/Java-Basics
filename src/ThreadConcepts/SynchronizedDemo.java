package ThreadConcepts;
class Account{
	private int salary=30000;
	synchronized void withrow(int amount) {
		if(salary>=amount) {
			System.out.println(salary);
		}else {
			System.out.println(amount);
		}
	}
}
class SBI extends Account{
	
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.withrow(20000);

	}
}
