class Lab5 {

	public static void main(String args[]) {
		
		int num = (int) Math.floor(Math.random()*99 + 1);
			
		boolean flag = false;

		if(num==1) {
			
			System.out.println("Number is 1");
			return;
		}

		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag = true;
				System.out.println("Factor Found!!");
				break;
			}
		}

		if(flag) {
			
			System.out.println(num + " is not a prime number.");
		}

		else {
			
			System.out.println(num + " is a prime number");
		}
	}

}