package ControlFlowLevel_2;
import java.util.Scanner;

public class FizzBuzzwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = Scanner.nextInt();
		if(number <= 0) {
			System.out.println("please enter  positive number  ");
		}else {
			int i = 1;
			  while (number >= i ) {
				  if(i % 5 == 0 && i % 3 == 0) {
					  System.out.println("Fizzzbuzz");
				  }
				  else if ( i % 5 == 0 ) {
					  System.out.println("Fizz");
				  }
				  else if (i % 3 == 0 ) {
					  System.out.println("Buzz");
				  }
				  else {
					  System.out.println(i);
				  }
				  i++;
			  }
		}
		Scanner.close();

	}

}
