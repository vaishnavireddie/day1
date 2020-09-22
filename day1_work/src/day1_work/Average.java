package day1_work;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter three number :");
		float firstNum  = input.nextFloat();
		float secondNum  = input.nextFloat();
		float thirdNum  = input.nextFloat();
		System.out.println("Average : " + ((firstNum + secondNum + thirdNum)/3));
        input.close();
	}

}