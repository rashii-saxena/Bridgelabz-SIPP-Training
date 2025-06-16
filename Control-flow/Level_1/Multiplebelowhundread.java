package ControlFlowLevel_1;
import java.util.Scanner;

public class Multiplebelowhundread {
	public static void main(String args []) {
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Enter the positive number ");
		int number = Scanner.nextInt();
		 if (number <=0 || number >100) {
			 System.out.println("Please enter the postive number below 100");
		 }
		 else {
			 for(int i =100; i >=1; i--) {
				 if (i % number == 0 ) {
					 System.out.println(i);
				 }
			 }
		 }
		 Scanner.close();
	}

}
