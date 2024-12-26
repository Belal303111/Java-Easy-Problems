import java.util.Scanner;

public class Colourblindness {
    public static void main(String []args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int n=s.nextInt();
            boolean test=true;
            s.nextLine();
            String a=s.nextLine();
            String b=s.nextLine();
            int i=0;
 while(i<n)
 {
    if(a.charAt(i)!=b.charAt(i))
    {
        if(a.charAt(i)=='G' && b.charAt(i)=='R')
        {
            test=false;
            break;
        }
        else if(b.charAt(i)=='G' && a.charAt(i)=='R')
        {
            test=false;
            break;
        }
        else if(a.charAt(i)=='B' && b.charAt(i)=='R')
        {
            test=false;
            break;
        }
        else if(b.charAt(i)=='B' && a.charAt(i)=='R')
        {
            test=false;
            break;
        }
        else test=test;
    }
     i++;
 }
       if(test==true) System.out.println("YES");
       else System.out.println("NO");
            t--;
        }
    }
}
