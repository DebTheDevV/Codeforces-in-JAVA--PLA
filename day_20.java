import java.util.Scanner;

public class day_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input as string to avoid numeric parsing limits
        String s = sc.next();
        int luckyCount = 0;
        
        // Count lucky digits
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '4' || ch == '7') {
                luckyCount++;
            }
        }
        
        // Check if the total count is a lucky number
        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
