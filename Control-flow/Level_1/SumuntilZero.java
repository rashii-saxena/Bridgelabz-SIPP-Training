package ControlFlowLevel_1;
import java.util.Scanner;

public class SumuntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		double total = 0.0;
		double number;
		
		System.out.print("Enter the number 0 to stop ");
		  number = Scanner.nextDouble();
		 while (number !=0) {
			 total = total+number;
			 
			 System.out.print("Enter the number 0 to stop");
			 number = Scanner.nextDouble();
			System.out.println("the total sum is" + total);
			 
		 }

	}

}
