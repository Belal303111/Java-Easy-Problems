import java.util.Scanner;

public class MealDelivery {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int A=s.nextInt();
        int B=s.nextInt();
        int a,b;
        if(x>A) a=x-A;
        else a=A-x;
        if(x>B) b=x-B;
        else b=B-x;
        if(a>b) System.out.println("B");
        else System.out.println("A");
    }
}
