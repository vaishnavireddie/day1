 package day1_work;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter first number :");
		int firstNum  = input.nextInt();
		System.out.println("Enter second number :");
		int secondNum  = input.nextInt();
		input.close();
		System.out.println("Before swapping :" + "number1 = " + firstNum +" number2 = " + secondNum);
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		System.out.println("After swapping :" + "number1 = " + firstNum +" number2 = " + secondNum);
	}

}
