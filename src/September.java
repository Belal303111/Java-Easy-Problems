import java.util.Scanner;

public class September {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt();
        boolean test=false;
        while (n>0)
        {
            if(n%10==9) {
                test=true;
                break;
            }
            n/=10;
        }
        if(test==true) System.out.println("Yes");
        else System.out.println("No");
    }
}
