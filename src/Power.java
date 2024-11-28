import java.util.Scanner;

public class Power {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        long b = s.nextLong();
        int i=0;
        long c=0;
        boolean test=false;
        while(c<b)
        {
            c=(long)Math.pow(i,i);
            if(c==b)
            {
                test=true;
                break;
            }
            i++;
        }
        if(test==true) System.out.println(i);
        else System.out.println(-1);
    }
}
