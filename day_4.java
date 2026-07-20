import java.util.Scanner;
 
public class day_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
 
        for (int i = 0; i < n; i++) {
            String statement = scanner.next();
            // Check if the statement contains the increment operation
            if (statement.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
 
        System.out.println(x);
        scanner.close();
    }
}