import java.util.Scanner;

public class Panking {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int A=s.nextInt();
        int B=s.nextInt();
        int c=A*n;
        if(B<c) System.out.println(B);
        else System.out.println(c);
    }
}
