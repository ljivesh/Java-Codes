

class Lab7 {

	public static void main(String args[]) {
		
		System.out.println("Jivesh Lakhani 047");
		
		float n1 = Float.parseFloat(args[0]);
		float n2 = Float.parseFloat(args[2]);
		String op = args[1];

		switch(op) {
			
			case "+": {
				System.out.println(n1+n2);
				break;
			}
			
			case "-": {
				System.out.println(n1-n2);
				break;
			}
			
			case "X": {
				System.out.println(n1*n2);
				break;
			}
		
			case "/": {
				if(n2!=0) System.out.println(n1/n2);					
				else System.out.println("Can't divide by zero");
				break;
			}
			
			case "p": {
				System.out.println(Math.pow(n1,n2));
				break;
			}
			
		}

	}

}