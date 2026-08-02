import java.util.Scanner;

public class day_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // Integer math equivalent to ceil(x / 5.0)
        int steps = (x + 4) / 5;
        
        System.out.println(steps);
    }
}
