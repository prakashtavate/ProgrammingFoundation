
public class ReverseOfNumber {



public static void main(String[] args) {
	int result = reverse(123);
	System.out.println(result);

}
	public static int reverse (int number) {
	
		int reverseNumber =0;
		int digit = 0;
		
		while (number>0) {
			digit = number % 10;
			System.out.println(digit);
			reverseNumber = reverseNumber*10 + digit;
			number = number/10;

				}
		return reverseNumber;
	}
}
				


	
