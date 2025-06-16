package ControlFlowLevel_3;
import java.util.Scanner;
public class LeapyearcheckLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the year ");
		int year = Scanner.nextInt();
		if (year <1582 ) {
			System.out.println("pls enter the valid year below 1582");
		}
		else
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )){
				System.out.println("this is a leap year ");
			}
			else {
				System.out.println("this is not a leap year ");
			}
		}
		Scanner.close();

	}

}

