import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class day_15 {
    // Keep your reader and tokenizer at the class level for clean global or fast I/O access
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = null;
 
    // A properly placed helper method outside of main
    static String next() throws Exception {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = reader.readLine();
            if (line == null) return null;
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer.nextToken();
    }
 
    public static void main(String[] args) throws Exception {
        String tcsStr = next();
        if (tcsStr == null) return;
        
        int tcs = Integer.parseInt(tcsStr);
        StringBuilder out = new StringBuilder();
        
        for (int tc = 1; tc <= tcs; ++tc) {
            String nStr = next();
            if (nStr == null) break;
            int n = Integer.parseInt(nStr);
            
            int[] v = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                v[i] = Integer.parseInt(next());
            }
            
            if ((n & 1) != 0) {
                out.append("NO\n");
                continue;
            }
            
            int mn = Integer.MAX_VALUE;
            int mx = -1;
            
            for (int i = 1; i <= n; ++i) {
                if ((i & 1) != 0) {
                    mn = Math.min(v[i] - 1, mn);
                } else {
                    mx = Math.max(v[i] + 1, mx);
                }
            }
            
            if (mn >= mx) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        System.out.print(out);
    }
}