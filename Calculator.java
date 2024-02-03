package akshay.variables;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
	
		System.out.println("!! Welcome to the world of calculation !! \n      * Please give us an input *");
		
	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first Number :" );
		
		int a= sc.nextInt();
		System.out.print("Enter the Second Number :" );
		
		int b=sc.nextInt();
		System.out.println("Please give me the commonds to do a arithematic operations." );
		
		int c=sc.nextInt();
		
		switch (c) {
		case 1: 
			System.out.println("addition = " + (c=a+b));
		break;
		case 2: 
			System.out.println("Substraction = " + (c=a-b));
		break;
		case 3: 
			System.out.println("Multiplication = " + (c=a*b));
		break;
		case 4: 
			System.out.println("Dividation = " + (c=a/b));
		break;
		case 5: 
			System.out.println("Modulation = " + (c=a%b));
		break;
		default: 
			System.out.println("Input Error");
		
		}

	}

}
