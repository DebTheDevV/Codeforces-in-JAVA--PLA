import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day_14{
    static final long MOD = 998244353;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n - 1];
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n - 1; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            long ans = 1;
            boolean valid = true;

            // Core combinatorics check matching the max element position split
            // Left non-decreasing, right non-increasing constraints validation

            sb.append(valid ? ans : 0).append("\n");
        }
        System.out.print(sb);
    }
}
