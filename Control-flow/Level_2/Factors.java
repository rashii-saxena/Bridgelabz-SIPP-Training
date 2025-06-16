package ControlFlowLevel_2;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = Scanner.nextInt();
		 if ( num <=0 ) {
			 System.out.println("please enter positive number " );
		 }
		 else {
			 for (int i =1; i< num ; i++) {
				 if (num % i == 0 ) {
					 System.out.println(i);
				 }
			 }
		 }
		 Scanner.close();

	}

}
