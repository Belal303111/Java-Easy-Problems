import java.util.Scanner;

public class Twice {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int [] b=new int[t];
        int f=0;
        while(f<t)
        {
            int n=s.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            if(n==1) b[f]=0;
            else{
                int k=0;
                for(int i=0;i<n;i++)
                    for(int j=n-1;j>=0;j--)
                        if(a[i]==a[j])
                        {
                            k++;
                            break;
                        }
                //System.out.println(k);
                b[f]=k;
            }
            f++;
        }
        for(int i=0;i<f;i++)
            System.out.println(b[i]);

    }
}
