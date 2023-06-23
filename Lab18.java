class Lab18 {
	public static void main(String args[]) {
		Fake faked = new Fake();
		faked.copyright();
		
	}
}

final class Orignal {
	
	void copyright() {
		System.out.println("Copyright Menma 2023");
	}
	
}

class Fake extends Orignal {
	
	void copyright() {
		System.out.println("Copyright Amnem 2023");
	}
	
}