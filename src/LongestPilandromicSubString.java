import java.util.Scanner;

public class LongestPilandromicSubString{
    public static void main(String [] args)
    {
        Scanner s =new Scanner(System.in);
        String n=s.nextLine();
        Solution m=new Solution();
        System.out.println(m.longestPalindrome(n));
    }
}
class Solution {
    boolean isPalindrom(String s)
    {
        int i=0,j=s.length()-1;
            while(i<=j)
            {
                if(s.charAt(i)!=s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
    }

    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        if(s.length()==2)
        {
            if(s.charAt(0)!=s.charAt(1)) return s.substring(0,1);
            else return s;
        }
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(isPalindrom(s.substring(i,j))) return s.substring(i,j);
            i++;
            if(isPalindrom(s.substring(i,j))) return s.substring(i,j);
            j--;
        }
        return "";
    }
}