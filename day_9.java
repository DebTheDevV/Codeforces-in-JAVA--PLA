import java.util.Scanner;
import java.util.HashSet;

public class day_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        if (scanner.hasNext()) {
            String username = scanner.next();
            
            
            HashSet<Character> distinctChars = new HashSet<>();
            for (int i = 0; i < username.length(); i++) {
                distinctChars.add(username.charAt(i));
            }
            
            
            if (distinctChars.size() % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
        }
        
        scanner.close();
    }
}
