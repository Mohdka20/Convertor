package function;

import java.util.Scanner;

public class convertor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	manageInput manage = new manageInput();
		 int operation = 0;
		 String result = null ;
		 final int BINARY = 1;
		 final int OCTAL= 2;
		 final int HEX = 3;
		
		
		 
		System.out.println("Enter the operation");
		System.out.println("1 - Convert to Binary");
		System.out.println("2 - Convert to Octal");
		System.out.println("3 - Convert to Hex");
		operation = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter a number to convert :  ");
		manage.setNumber1(sc.nextInt());
		sc.nextLine();
		while (sc.nextInt() != 0) {
		if (manage.number1 != HEX || manage.number1 != OCTAL || manage.number1 != BINARY) {
			System.out.println("Wrong Input");

		}
			
		if (operation == BINARY) {
			result =Integer.toBinaryString(manage.number1);
		}
		else if (operation == OCTAL) {
			result =Integer.toOctalString(manage.number1);
		}else if (operation ==HEX) {
			result =Integer.toHexString(manage.number1);
		}
	
		System.out.println(result);
		}

}
}
