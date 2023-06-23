class Lab17a {

	public static void main(String args[]) {
		
		System.out.println("Jivesh Lakhani 047");
		System.out.println("volume() function used for a cube of length 2.5 units: "+volume(2.5)+" cubic units");
		System.out.println("volume() function used for a cylinder of radius 3 units and height 5 units: "+volume(3,5)+" cubic units");
		System.out.println("volume() function used for a cuboid of length 5, breadth 2 and height 10 units: "+volume(5, 2, 10)+ "cubic units");
		
	}

	static double  volume(double s) {
		return Math.pow(s,3);
	}

	static double volume(double r, double h) {
		return (Math.PI)*(Math.pow(r,2))*h;
	}

	static double volume(double l, double b, double h) {
		return l*b*h;
	}

}

