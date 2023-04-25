import java.util.Scanner;

public class Main {

	//with argument with return
	//method function
	
	public static float add(float a , float b) {
		return a + b;
		
	}
	public static float sub(float a , float b) {
		return a - b;
	}

	public static float mul(float a , float b) {
		return a * b;
	}

	public static float div(float a , float b) {
		return a / b;
	}
	
	public static void main(String[] args) {
	// we need to call all the functionalities & it should be like a menu driven program
		//how to show all methods as an option to my user?
		// Switch case
		
		//we need to render our options.
		
		System.out.println("Enter the options based on choice "
				+ "1. Add \n 2. Sub \n 3. Mul \n 4. Div \n 5. exit");
		// Scanner Class : is designed to accept the inputs from the user.
		// 1. This Scanner class is defined by java from version 1.5.
		// 2. It has built in functions/methods to accept specific type values.
		// to accept integer : nextInt()
		// to accept float : nextFloat()
		// & so on
		//3. This scanner class is available in java.utils package.
		//package = location where class/interfaces are available
		Scanner scanner = new Scanner(System.in);
		//scanner : reference : it refer the object
		// it will help us to use the data / methods from object(which you will get it from the RHS).
		// new : it will inform the java to create the object.
		// Scanner (): it is used to initialize the object ====>
		// System.in 
		while(true) {
		int choice = scanner.nextInt();
		switch(choice) {
		case 1 :{
			System.out.println("addition case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
		
			float result = add(number1, number2);
			System.out.println("addition result"+result);
		}
			break;
		case 2:{
			System.out.println("Sub case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
		
			float result = sub(number1, number2);
			System.out.println("Substraction result"+result);
		}
			break;
		case 3:{
			System.out.println("Multiplication case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
		
			float result = mul(number1, number2);
			System.out.println("Multiplication result"+result);
		}
			break;
		case 4:{
			System.out.println("Division Case");
	
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
		
			float result = div(number1, number2);
			System.out.println("Division result"+result);
		}
		break;
		case 5:{
			System.out.println("5");
			System.exit(0);//end of execution of the program
		}
		default:{
			System.out.println("default case");
			}
		}
		}
	}
}

