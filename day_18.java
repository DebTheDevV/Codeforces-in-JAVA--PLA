import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Loop k times to apply the subtraction logic
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10; // Remove the trailing zero
            } else {
                n -= 1;  // Subtract one
            }
        }
        
        // Output the final number
        System.out.println(n);
        sc.close();
    }
}
