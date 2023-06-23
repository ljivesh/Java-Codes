class Lab20 {
	
	public static void main(String args[]) {

		System.out.println("Jivesh Lakhani 047");
		BOB b1= new BOB();
		System.out.println("Bank name is: "+b1.get_bank_name());
		System.out.println("Bank interest rate: "+b1.get_bank_name());
	}
}

abstract class Bank {

	abstract double get_rate();
	abstract String get_bank_name();
}

class BOB extends Bank {
	
	double rate = 3.5;
	String bank_name = "Bank of Baroda";

	public double get_rate() {
		return rate;
	}

	public String get_bank_name() {
		return bank_name;
	}
}

