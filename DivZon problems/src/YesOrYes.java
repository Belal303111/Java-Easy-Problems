import java.util.Scanner;

public class YesOrYes {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String [] A=new String[n];
        s.nextLine();
        for(int i=0;i<n;i++)
            A[i] = s.nextLine();
        for(int i=0;i<n;i++)
        {
            A[i] = A[i].toUpperCase();
            if (A[i].equals("YES")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
