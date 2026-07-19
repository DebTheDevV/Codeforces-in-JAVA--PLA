import java.util.Scanner;
 
public class day_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        int n = scanner.nextInt();
        
        // Loop through each word
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            int length = word.length();
            
            // Check if the word is strictly longer than 10 characters
            if (length > 10) {
                // Construct the abbreviation: first char + middle count + last char
                System.out.println("" + word.charAt(0) + (length - 2) + word.charAt(length - 1));
            } else {
                // Print the original word
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}