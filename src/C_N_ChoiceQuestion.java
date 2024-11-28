import java.util.Scanner;

public class C_N_ChoiceQuestion {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int [] c=new int[n];
        for(int i=0;i<n;i++)
            c[i]=s.nextInt();
        int m=a+b;
        for(int i=0;i<n;i++)
        {
            if(m==c[i])
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
