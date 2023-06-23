import java.util.Scanner;

class Lab9 {

	public static void main(String args[]) {
		
		System.out.println("Jivesh Lakhani 047");

		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the no. of values you want to enter: ");
		int n = inp.nextInt();

		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the "+(i+1)+"th no.: ");
			arr[i] = inp.nextInt();
		}
		Sorter sort = new Sorter();
		sort.insertion_sort(arr);
		
		System.out.print("\n");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}

		
	}
}


class Sorter {
	public void insertion_sort(int arr[]) {
		
	  int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }		

	}
}