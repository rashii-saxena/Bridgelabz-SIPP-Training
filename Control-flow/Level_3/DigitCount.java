package ControlFlowLevel_3;
import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = Scanner.nextInt();
		if (num == 0) {
			System.out.println("its is single digit number ");
		}
		else {
			int count = 0;
			num = Math.abs(num);
		 while (num != 0) {
             num = num / 10;
             count ++ ;
		 }
		 System.out.println(" the no of digit is " + count );
		}
		Scanner.close();
	}

}
