package ControlFlowLevel_1;
import java .util.Scanner;

public class Numbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = Scanner.nextInt();
		if(num == 0) {
			System.out.println("The number is zero");
		}
		else if (num > 0) {
			System.out.println("the number is positive");
		}
		else {
			System.out.println("the number is negative");
		}
		Scanner.close();
		

	}

}
