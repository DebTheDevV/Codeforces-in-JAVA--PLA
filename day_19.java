import java.util.Scanner;

public class day_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            // Check if the current layer is odd or even
            if (i % 2 != 0) {
                result.append("I hate ");
            } else {
                result.append("I love ");
            }
            
            // Check if it is the final layer
            if (i == n) {
                result.append("it");
            } else {
                result.append("that ");
            }
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
