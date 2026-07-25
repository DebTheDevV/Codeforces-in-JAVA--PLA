import java.util.Scanner;

public class day_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                if (sc.nextInt() == 1) {
                    // Center is at (3, 3) for 1-based indexing
                    int moves = Math.abs(r - 3) + Math.abs(c - 3);
                    System.out.println(moves);
                    sc.close();
                    return;
                }
            }
        }
        sc.close();
    }
}
