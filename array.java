import java.util.Scanner;
class ArraySumAndAvg {
    public static void main(String[] args) {
		
	System.out.println("Jivesh Lakhani 047");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        // get input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // calculate sum of array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // calculate average of array elements
        double avg = (double) sum / n;
        // print the sum and average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
        scanner.close();
    }
}
