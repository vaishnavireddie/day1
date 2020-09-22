package day1_work;

import java.util.Scanner;

public class Asciii {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a char :");
		System.out.println("Ascii value " + (int)input.next().charAt(0));
         input.close();
	}

}
