package Bridgelab.Level1;
import java.util.Scanner;

public class Handshakenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("Maximum number of handshakes: " + handshakes);
        input.close();
    }
}