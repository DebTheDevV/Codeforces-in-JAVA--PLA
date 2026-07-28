import java.util.Scanner;
import java.util.Arrays;

public class day_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNext()) {
            String s = in.next();
            
            // Remove the '+' signs to isolate the digits
            String digitsOnly = s.replace("+", "");
            
            // Convert to a char array and sort it
            char[] arr = digitsOnly.toCharArray();
            Arrays.sort(arr);
            
            // Print the sorted elements separated by '+'
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if (i < arr.length - 1) {
                    sb.append("+");
                }
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}
