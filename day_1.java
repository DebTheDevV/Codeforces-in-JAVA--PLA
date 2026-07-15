//problem- 4A
import java.util.Scanner;
 public class day_1 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0 && n > 2){
            System.out.print("YES");
            return;
        }
        System.out.print("NO");
        sc.close();
        return;
    }
}

