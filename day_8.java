import java.util.Scanner;

public class day_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read both inputs and convert them to lowercase immediately
        String str1 = scan.next().toLowerCase();
        String str2 = scan.next().toLowerCase();
        
        // Lexicographically compare the unified strings
        int result = str1.compareTo(str2);
        
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scan.close();
    }
}
