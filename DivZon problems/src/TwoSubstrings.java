import java.util.Scanner;

public class TwoSubstrings {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
         boolean test1=false; //,test2=false;
        //System.out.println(n.length());
        for(int i=0;i<n.length()-1;i+=2)
        for(int j=i+2;j<n.length()-1;j+=2)
        {
          // System.out.println("substring I : "+n.substring(i,i+2));
          //  System.out.println("substring J : "+n.substring(j,j+2));
            String x=new StringBuilder(n.substring(i,i+2)).reverse().toString();
            if(x.equals(n.substring(j,j+2))) {
                test1=true;
                break;
            }
            //if(n.substring(i,i+2).equals("BA")) test2=true;
        }
       // System.out.println("Test1: "+test1); //+" Test2: "+test2);
        if(test1==true) System.out.println("YES");
        else System.out.println("NO");

    }
}
