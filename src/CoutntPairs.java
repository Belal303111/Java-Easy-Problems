import java.util.Scanner;

public class CoutntPairs {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int max=a[0],min=a[n-1];
       // System.out.println("Max: "+max+ " Min: "+min);
        int i=1,j=n-2;
        while(i<n)
        {
            if(a[i]>max) max=a[i];
            if(a[j]<min) min=a[j];
            i++;
            j--;
        }
        //System.out.println("Max: "+max+ " Min: "+min);
        int c=max+min;
        int k=0;
        for(int f=0;f<n;f++)
            for(int h=f+1;h<n;h++)
                if(a[f]+a[h]==c) k++;
        System.out.println(k);

    }
}
