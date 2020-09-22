package day1_work;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter first number :");
		short firstNum  = input.nextShort();
		System.out.println("Enter second number :");
		short secondNum  = input.nextShort();
		System.out.println("Addition : " +(firstNum + secondNum));
		System.out.println("Subtraction : " +(firstNum - secondNum));
		System.out.println("Multiplication : " +(firstNum * secondNum));
		System.out.println("Division : " +(firstNum / secondNum));
		System.out.println("Remainder : " +(firstNum % secondNum));
        input.close();
	}

}
