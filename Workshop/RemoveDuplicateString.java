package Workshop;

import java.util.Scanner;

public class RemoveDuplicateString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String result = removeDuplicateCharacters(input);

      
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

             
            

        return result.toString();
    }
}