package ControlFlowLevel_2;
import java.util.Scanner;

public class BonusSalaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		 System.out.println("Enter the salaary ");
		 double salaray = Scanner.nextDouble();
		 System.out.println("Enter the no. of years ");
		 double years = Scanner.nextDouble();
		  
		 if (years > 5) {
			 double bonas = 0.05 * salaray ;
			 System.out.println("the bonas is " +  bonas );
		 }
		 else {
			 System.out.println("the service year is less then five so no bonas is given");
		 }
		 Scanner.close();

	}

}
