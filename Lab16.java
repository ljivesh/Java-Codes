class Lab16 {
	
	public static void main(String args[]) {

	System.out.println("Jivesh Lakhani 047");
		
	BOB acc1 = new BOB();
	SBI acc2 = new SBI();

	System.out.println("BOB interst rate: "+acc1.get_rate());
	System.out.println("SBI interest rate: "+acc2.get_rate());
		
	}


}

class RBI {

	double base_rate = 3;

}

class BOB extends RBI {
	
	double fixed_rate = base_rate + 2;
	
	public double get_rate() {
		return fixed_rate;
	}

}

class SBI extends RBI {
	
	double fixed_rate = base_rate + 1.3;

	public double get_rate() {
		return fixed_rate;
	}
}