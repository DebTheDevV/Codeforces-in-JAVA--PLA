import java.util.Scanner;

public class day_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input word
        String word = scanner.next();
        
        // Capitalize the first letter and combine with the rest of the string
        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        
        // Output the finalized string
        System.out.println(result);
        
        scanner.close();
    }
}
