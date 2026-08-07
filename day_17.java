import java.util.Scanner;

public class day_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read k (cost of first banana), n (initial dollars), w (number of bananas)
        long k = scan.nextLong();
        long n = scan.nextLong();
        long w = scan.nextLong();
        
        // Calculate the total cost using the sum of arithmetic progression formula
        long totalCost = k * (w * (w + 1)) / 2;
        
        // Calculate the amount to borrow
        long borrow = totalCost - n;
        
        // If borrow is negative or zero, he needs 0 dollars
        if (borrow < 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }
        
        scan.close();
    }
}
