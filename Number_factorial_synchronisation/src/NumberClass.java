import java.util.Random;

public class NumberClass {
	
	
	
	int maxrange = 100;
	Random ranNum = new Random();
	int number = ranNum.nextInt(maxrange);
	
	public void displayNumber(int n) {
		
		for (int i = 0; i < 5; i++) {

			System.out.println("Thread number "+n);
			System.out.println(number);
		}
		
	}
	
public void displayFactorial(int n) {
		
	for (int i = 0; i < 5; i++) {

		System.out.println("Thread number "+n);
		
		
		for (int j = 1; j < number; j++) {
			number = number * j;
		}
		System.out.println(number);
	}
		
		
		
	}
}
