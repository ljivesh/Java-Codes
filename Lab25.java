package Lab25;

class Lab25 {


	public static void main(String args[]) {

		MultiThread m1 = new MultiThread();
		MultiThread m2 = new MultiThread();
		m1.start();
		m2.start();
	}

}

public class MultiThread extends Thread {

	
	public void run() {
		
		int n = 5;
		for(int i=0; i<n; i++) {
		
			System.out.println("Counting: "+i+" by Thread: "+Thread.currentThread().getId());
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}