
public class ArmStrongNumber {

	// 153 = 1^3 + 5^3 + 3^3
	// 153 = 1 + 27 + 125
	public static void main(String[] args) {
		boolean result =isArmStrong (153);
		System.out.println(result);
	}
			public static boolean isArmStrong (int number) {
			int digit;
			int temp = number;
			int sum = 0;
			while(number>0) {
				digit = number %10;
				sum= sum+digit*digit*digit;
				number = number/10;
	
		}
			if (temp == sum) {
				return true;
			}
			else {
				return false;
			}
		}
	}


