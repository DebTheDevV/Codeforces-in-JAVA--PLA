import java.util.Scanner;

public class day__12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the initial weights
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int years = 0;
        
        // Loop runs as long as Limak is less than or equal to Bob
        while (a <= b) {
            a *= 3;      // Limak's weight triples
            b *= 2;      // Bob's weight doubles
            years++;     // Increment the year counter
        }
        
        // Print the final result
        System.out.println(years);
        
        sc.close();
    }
}
