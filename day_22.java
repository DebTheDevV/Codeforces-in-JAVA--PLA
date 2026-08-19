import java.util.Scanner;

public class day_22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of games
        int n = sc.nextInt();
        // Read the outcomes string
        String s = sc.next();
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Count wins by iterating through the string
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }
        
        // Compare counts and output the result
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        sc.close();
    }
}
