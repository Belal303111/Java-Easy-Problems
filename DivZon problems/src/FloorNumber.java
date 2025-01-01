import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
        int n=s.nextInt();
        int x=s.nextInt();
        if(n==1 || n==2) System.out.println(1);
        else {
            int k=1;
            for(int i=2;i<n;i+=x)
                k++;
            System.out.println(k);
        }
            t--;
        }
    }
}
