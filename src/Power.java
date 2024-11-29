import java.util.Scanner;

public class Power {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        long b = s.nextLong();
        if (b == 1) System.out.println(1);
        else {
            int i = 2;
            long c = 0;
            boolean test = false;
            while (c < b && i<=15) {
                c = (long) Math.pow(i, i);
                if (c == b) {
                    test = true;
                    break;
                }
                i++;
            }
            if (test == true) System.out.print(i);
            else System.out.print(-1);
        }
    }
}
