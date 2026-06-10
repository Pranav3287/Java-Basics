package BankApp;
abstract class bank{
	abstract double Interst();
}

class SBI extends bank{
	double Interst() {
		double rate=6.00;
		System.out.println("Interst rate is:"+rate);
		return 0;
	}
}
class ICICI extends bank{
	double Interst() {
		double rate=7.00;
		System.out.println("Interst rate is:"+rate);
		return 0;
	}
}
class IDBI extends bank{
	double Interst() {
		double rate=5.10;
		System.out.println("Interst rate is:"+rate);
		return 0;
	}
}
class Koteck extends bank{
	double Interst() {
		double rate=8.10;
		System.out.println("Interst rate is:"+rate);
		return 0;
	}
}
public class BankAbstarct extends bank{

	@Override
	double Interst() {
		return 0;
	}
	public static void main(String[] args) {
		BankAbstarct d=new BankAbstarct();
		SBI d2=new SBI();
		ICICI d3=new ICICI();
		IDBI d4=new IDBI();
		Koteck d5=new Koteck();
		d2.Interst();
		d3.Interst();
		
	}
}
