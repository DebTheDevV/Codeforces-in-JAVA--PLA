import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int upperCount = 0;
        int lowerCount = 0;
        
        // Count uppercase and lowercase characters
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        
        // Print the string according to the dominance rule
        if (upperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
        
        in.close();
    }
}
D