
import java.util.Scanner;
 
public class day_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Output the integer result of the total area divided by 2
        System.out.println((m * n) / 2);
        
        scanner.close();
    }
}