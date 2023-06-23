class Lab13 {
	
	public static void main(String args[]) {

		System.out.println("Abhijit Singh 037");

		Point p = new Point();
		Point q = new Point(3,4);
		Point r = new Point(4,6,8);
		
	}


}

class Point {
	
	int x = 0;
	int y = 0;
	int z = 0;

	Point() {

		System.out.println("Default Constructor");
		System.out.println("X is: "+x+" and Y is:"+y);
	}

	Point(int a, int b) {

		x=a;
		y=b;

		System.out.println("Parametrized constructor");
		System.out.println("X is: "+x+" and Y is: "+y);
	}
	Point(int a, int b, int c) {

		x=a;
		y=b;
		z=c;
		
		System.out.println("Paremetrized constructor again");
		System.out.println("X is:"+x+", Y is: "+y+" and Z is: "+z);
	}

}