import java.util.Scanner;

class Lab4 {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("No. a: ");
		int a = inp.nextInt();

		System.out.print("No. b: ");
		int b = inp.nextInt();

		int sum = a + b;
		System.out.print("Sum of "+a+" and  "+" is: "+sum);
		
	}
}