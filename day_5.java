import java.util.Scanner;
 
public class day_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n (number of participants) and k (the benchmark place)
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Store scores in an array
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        // The score of the participant at the k-th place (0-indexed logic)
        int benchmarkScore = scores[k - 1];
        int advancers = 0;
        
        // Count how many participants advance
        for (int i = 0; i < n; i++) {
            if (scores[i] >= benchmarkScore && scores[i] > 0) {
                advancers++;
            }
        }
        
        // Output the total count
        System.out.println(advancers);
        
        sc.close();
    }
}