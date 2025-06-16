package ControlFlowLevel_1;
import java.util.Scanner;

public class RocketLaunchCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter the countdown");
		int counter = Scanner.nextInt();
		while (counter >=1) {
			System.out.println (counter);
			counter--;
		}
		System.out.println (" the rocket is ready to launch");
		Scanner.close();

	}

}
