package ControlFlowLevel_1;
import java .util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner (System.in);
		 System.out.println("Enter the Three number ");
		 int num1 =  Scanner.nextInt();
		 int num2 = Scanner.nextInt();
		 int num3 = Scanner.nextInt();
		 
		 if(num1 > num2 && num1 > num3 ) {
			 System.out.println("First is largest ");
		 }
		 else if (num2 > num1 && num2 > num3 ) {
			 System.out.print("Second is largest");
		 }else {
			 System.out.print(" Third is largest");
		 }
		 Scanner.close();
		 

	}

}
