package ControlFlowLevel_1;
import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the month");
		System.out.println("Enter the day ");
		int month = Scanner.nextInt();
		int day = Scanner.nextInt();
		  if (month ==3 ) {
			  if(day > 20 && day <31) {
				  System.out.println("It is Spring Season");
			  }
			  else {
				  System.out.println("Its not Spring season ");
			  }
		  }
		  else if (month == 4) {
			  if (day > 1 && day <30) {
				  System.out.println("Its Spring Season ");
			  }
			  else {
				  System.out.println("its not Spring season");
			  }
		  }
		  else if (month == 5  ) {
			  if(day >1 && day <31 ) {
				  System.out.println("Its spring Seaosn ");
			  }
			  else {
				  System.out.println("Its not ");
			  }
		  }
		  else if (month == 6 ) {
			  if(day >1 && day <20) {
				  System.out.println("Its Spring Season ");
			  }
			  else {
				  System.out.println("Its not ");
			  }
		  }
		  else {
			  System.out.print(" Its not a Spring Season");
		  }
		  Scanner.close();
		 

	}

}
