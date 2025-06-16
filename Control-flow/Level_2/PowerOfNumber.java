package ControlFlowLevel_2;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = Scanner.nextInt();
		System.out.println("Ente rthe power ");
		int power = Scanner.nextInt();
		if (num <=0 || power <=0) {
			System.out.println("enter the positive integer ");
		}
		else {
			int result = 1;
			for (int i = 1; i <=power ; i++ ) {
				result = result *num ;
			}
			System.out.println(num + "^" + power + "=" + result );
		}
		Scanner.close();

	}

}
