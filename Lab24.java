class Lab24 {
	
	

	public static void main(String s1) {
		
		StringOps opr = new StringOps();
		System.out.println("Reverse of "+s1+" is: "+opr.reverse(s1));
		System.out.println("Lower Case: "+opr.toLower(s1));
		System.out.println("Upper Case: "+opr.toUpper(s1)+"\n");
		
	}

	public static void main(String s1, String s2) {
			
		StringOps opr = new StringOps();
		System.out.println( opr.isEqual(s1,s2) ? "Strings are equal." : "Strings are not equal.");
		
	}

	public static void main(String args[]) {
	
		System.out.println("Jivesh Lakhani 047\n");
		main(args[0]);
		main(args[1]);
		main(args[0], args[1]);
	
	}


}

class StringOps {

	public boolean isEqual(String s1, String s2) {
		return s1 == s2 ? true:false;
	}


	public String reverse(String s) {
		String s2 = new String();
		
		for(int i=0; i<s.length(); i++) {
			int len = s.length();
			s2 = s.charAt(i) + s2.substring(0, i);
		}

		return s2;
		
	}

	public String toUpper(String s) {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >=97 && s.charAt(i) <=122) 
				s = s.substring(0, i) + ( (char) ((int) s.charAt(i) - 32)) + s.substring(i+1);
														
		}
		
		return s;
	}

	public String toLower(String s) {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <=90)
				s = s.substring(0, i) + ( (char) ((int) s.charAt(i) + 32)) + s.substring(i+1);
		}

		return s;
	}

}