import java.util.Scanner;

public class day_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the two input words
        String s = sc.next();
        String t = sc.next();
        
        // Reverse string t using StringBuilder
        String reversedT = new StringBuilder(t).reverse().toString();
        
        // Compare the original string s with the reversed string t
        if (s.equals(reversedT)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
