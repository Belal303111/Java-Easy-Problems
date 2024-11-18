import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int j=0;
        while(j<s.length()-(k-1))
        {
         int i=j;
        String h=s.substring(i,j+k);
         if(largest=="") largest=h;
         if(smallest=="") smallest=h;
        if(largest.compareTo(h)<0) largest=h;
        if(smallest.compareTo(h)>0) smallest=h;
         j++;
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}