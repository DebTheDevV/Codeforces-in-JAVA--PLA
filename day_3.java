import java.util.Scanner;
public class day_3 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of problems
        int n = scanner.nextInt();
        int solvedProblemsCount = 0;
        
        // Iterate through each problem
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // Check if at least two friends know the solution
            if (petya + vasya + tonya >= 2) {
                solvedProblemsCount++;
            }
        }
        
        // Output the total count
        System.out.println(solvedProblemsCount);
        
        scanner.close();
    }
}
 
}
