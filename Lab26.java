class Lab26 {

	public static void main(String args[]) {
	
		MultiThread m1 = new MultiThread(5);
		MultiThread m2 = new MultiThread(6);
		m1.start();
		m2.start();
	}
	
	public static synchronized void table(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread: "+Thread.currentThread().getId()+"\t"+n+" X "+i+" = "+n*i);
		}
	}
}

class MultiThread extends Thread {

	int n;
	
	MultiThread(int n) {
		this.n = n;
	}
		
	public void run() {
		Lab26.table(n);
	}
}