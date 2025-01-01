//import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int x=digits[0];
        for(int i=1;i<digits.length;i++)
        {
            if(i<=digits.length-1) x*=10;
            x+=digits[i];
        }
        x++;
        System.out.println("X:"+x);
        ArrayList<Integer>n=new ArrayList<>();
        //int j=digits.length;
        while(x>0)
        {
            n.add(x%10);
            x/=10;
        }
        int [] m =new int [n.size()];
        int j=0;
        for(int i=n.size()-1;i>=0;i--)
        {
            m[i]=n.get(j);
            j++;
        }
        return m;
    }
}
//class main
//{
//    public static void main(String [] args)
//    {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int [] A = new int[n];
//        for(int i=0;i<n;i++)
//            A[i]=s.nextInt();
//        PlusOne M=new PlusOne();
//        // int [] f=new int[M.plusOne(A).length];
//        int [] f=M.plusOne(A);
//        for(int i=0;i<f.length;i++)
//          System.out.println(f[i]);
//    }
//}