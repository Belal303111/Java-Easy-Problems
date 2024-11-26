import java.util.Scanner;

public class Racecar {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String [] A=new String[n];
        boolean test=false;
        for(int i=0;i<n;i++)
            A[i]=s.nextLine();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String S=A[i]+A[j];
                int k=0,f=S.length()-1;
                while(k<S.length()/2)
                {
                    if(S.charAt(k)!=S.charAt(f))
                        break;
                    k++;
                    f--;
                }
                if(k==S.length()/2)
                {
                    if(S.charAt(k)==S.charAt(f))
                    {
                        test=true;
                        break;
                    }
                }
            }
               if(test==true)
                break;
        }
        if(test==true)
            System.out.println("YES");
        else System.out.println("NO");

    }
 }
