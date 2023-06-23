class Lab15 {
	
	public static void main(String args[]) {

		System.out.println("Jivesh Lakhani 047");
		
		BOB_RURAL acc = new BOB_RURAL();

		System.out.println("The base interest rate set by RBI is: "+acc.get_base_rate());
		System.out.println("The default rate of interest in BOB is: "+acc.get_fixed_rate());
		System.out.println("The interest rate for Rural Account is: "+acc.get_rural_rate());
	}
	
}

class RBI {
	
	double base_rate = 3;

}

class BOB extends RBI {
	
	double fixed_rate = base_rate + 1;

}

class BOB_RURAL extends BOB {
	double rural_rate = fixed_rate - 0.5;

	public double get_rural_rate() {
		
		return rural_rate;
	}
	public double get_fixed_rate() {
		
		return fixed_rate;
	}
	public double get_base_rate() {
		
		return base_rate;
	}
}