package MultiThread;

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