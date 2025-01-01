import java.util.Scanner;

public class ValidParentheses {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String n =s.nextLine();
        Solution m=new Solution();
        System.out.println(m.isValid(n));
    }
}
class Solution {
    public boolean isValid(String s) {
        boolean test=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)==')')
                    {
                        test=true;
                        System.out.println("first test: "+test);
                        break;
                    }
                }
                if(test==false) break;
            }
            else if(s.charAt(i)=='[')
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)==']')
                    {
                        test=true;
                        System.out.println("second test: "+test);
                        break;
                    }
                }
                if(test==false) break;
            }
            else if(s.charAt(i)=='{')
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='}') {
                        test=true;
                        System.out.println("third test: "+test);
                        break;
                    }
                }
                if(test==false) break;
            }
            else continue;

        }
        return test;
    }
}