package day1_work;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a number :");
		short num  = input.nextShort();
		Byte check = 0;
		for(short i = 1;i<= num;i++) {
			if(num% i == 0) 
				check++;
			}
		if(check == 2) {
			System.out.println(num +" is a prime number");
		}
		else {
			System.out.println(num +" is not a prime number");
		}
		input.close();
	}
}
