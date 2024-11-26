// The first problem

import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int r=s.nextInt();
        int g=s.nextInt();
        int b=s.nextInt();
        int n=((r*10+g)*10)+b;
        if(n%4==0)
            System.out.println("YES");
        else System.out.println("NO");
        }
    }
