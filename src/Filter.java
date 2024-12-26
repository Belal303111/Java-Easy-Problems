import java.util.Scanner;

public class Filter {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=s.nextInt();
        for(int i=0;i<n;i++)
            if(A[i]%2==0)
                System.out.print(A[i]+" ");
    }
}
