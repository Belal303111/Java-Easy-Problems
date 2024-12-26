import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int i=0;
        while(i<t) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if (a == b + c || b == a + c || c == a + b) System.out.println("YES");
            else System.out.println("NO");
            i++;
        }
    }
}
