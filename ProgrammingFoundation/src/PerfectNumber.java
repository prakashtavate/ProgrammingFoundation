
public class PerfectNumber {
	public static void main(String[] args) {
	boolean result = isPerfectNumber (28);
	System.out.println("perfect number status"+result);
	}
	public static boolean isPerfectNumber (int number) {
		int half = number/2;
		int sum = 0;
		int reminder = 0;
		// to sum the factors
		int counter =1;
		while (counter<=half) {
			reminder = number % counter;
			if (reminder ==0) {
				sum = sum+counter;
				}
			counter++;			
			
		}
		System.out.println(sum);
		if (number ==sum) {
			return true;
		}
		else return false;
		}
		
	}


