
class MyThread extends Thread{
	int i;
	NumberClass numbers;
	public MyThread(NumberClass numbers, int i) {
		this.i= i;
		this.numbers = numbers;
	}

	@Override
	public void run() {
		
		
		numbers.displayNumber(i);
		super.run();
	}
}

class MyThread2 extends Thread{
	int i;
	NumberClass numbers;
	public MyThread2(NumberClass numbers, int i) {
		this.i= i;
		this.numbers = numbers;
	}

	@Override
	public void run() {
		
		
		numbers.displayFactorial(i);
		super.run();
	}
}
public class SyncAssignment{

	public static void main(String[] args) {
		NumberClass numbers = new NumberClass();
		MyThread t1 = new MyThread(numbers, 1);
		
		t1.start();
		
		
		MyThread2 t2 = new MyThread2(numbers, 2);
		t2.start();
		
		
	}

}
