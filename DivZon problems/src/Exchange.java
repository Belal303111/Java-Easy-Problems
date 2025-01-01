import java.util.Scanner;

public class Exchange {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int n=s.nextInt();
        int i=0;
        while(i<n)
        {
            if(a%2!=0) a--;
            a=a/2;
            b+=a;
            i++;
            if(i==n) break;
            if(b%2!=0) b--;
            b=b/2;
            a+=b;
            i++;
        }
        System.out.print(a + " " + b);
    }
}
