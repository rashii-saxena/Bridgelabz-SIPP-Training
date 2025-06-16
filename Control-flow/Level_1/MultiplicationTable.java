package ControlFlowLevel_1;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = Scanner.nextInt();
		
		for(int i = 6 ; i <=9; i++ ) {
			System.out.println(number + "*" + i + "=" + number*i);
		}
		Scanner.close();
		
		

	}

}
