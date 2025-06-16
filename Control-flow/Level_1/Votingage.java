package ControlFlowLevel_1;
import java.util.Scanner;

public class Votingage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in); 
		System.out.println("Enter the age ");
		int age = Scanner.nextInt();
		if( age >= 18) {
			System.out.println("eligible to vote ");
		}
		else {
			System.out.println("not eligilbe");
		}
	
		Scanner.close();

	}

}
