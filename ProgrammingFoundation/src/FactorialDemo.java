

public class FactorialDemo {

	
	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 * 2 * 1
		
		// 
		int number = 5;
		
		int result = 1;
		int counter =number;
		
		
		
		while(counter>=1) {
			
			result = result * counter;
			counter--;// counter = counter - 1
			
			
		}
		System.out.println("Fact result "+result);
		
		
	}
}
