import java.util.Scanner;

public class Step {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        long k=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1]) {
                int f = a[i] - a[i + 1];
                a[i + 1] = a[i];
                k =k+ f;
            }
        }
        System.out.println(k);
    }
    }
