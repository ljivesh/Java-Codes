class Lab14 {

	public static void main(String args[]) {
	
	System.out.println("Abhijit Singh 037");
	
	BOB bank = new BOB("Jaipur");
		
	}

}

class Bank {
	String bank_name = "State Bank of India";

	Bank() {
		System.out.println("Bank name is: "+bank_name);
	}

	Bank(String name) {
		bank_name = name;
		System.out.println("Bank name is: "+bank_name);
	}

}

class BOB extends Bank {

	String branch_name = "Delhi";
	
	BOB() {
		
		bank_name = "Bank of Baroda";
				
		System.out.println("Bank name is: "+bank_name);
		System.out.println("Branch name is: "+branch_name);
	}

	BOB(String branch) {
		
		bank_name = "Bank of Baroda";
		branch_name = branch;
				
		System.out.println("Bank name is: "+bank_name);
		System.out.println("Branch name is: "+branch_name);
	}
}