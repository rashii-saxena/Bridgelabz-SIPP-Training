package ControlFlowLevel_2;
import java.util.Scanner;

public class Friendinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Enter Amar's age: ");
        int ageAmar = Scanner.nextInt();
        System.out.println("Enter Amar's height in cm: ");
        int heightAmar = Scanner.nextInt();

    
        System.out.println("Enter Akbar's age: ");
        int ageAkbar = Scanner.nextInt();
        System.out.println("Enter Akbar's height in cm: ");
        int heightAkbar = Scanner.nextInt();

   
        System.out.println("Enter Anthony's age: ");
        int ageAnthony = Scanner.nextInt();
        System.out.println("Enter Anthony's height in cm: ");
        int heightAnthony = Scanner.nextInt();

     
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

       
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        Scanner.close();
    }
}


	


