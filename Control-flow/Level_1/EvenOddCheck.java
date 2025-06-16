package ControlFlowLevel_1;
import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = Scanner.nextInt();
		 for(int i = 1; i <= number ; i++) {
			 if(i % 2 ==0) {
				 System.out.println( i +"number is even ");
			 }
			 else {
				 System.out.println( i + "number is odd");
			 }
		 }
		 Scanner.close();

	}

}
