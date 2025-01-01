import java.util.Scanner;
 import java.util.HashMap;
    public class Anagrams {
        public static int target(String s,char x)
        {
            int k=0;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)==x) k++;
            return k;
        }
        static boolean isAnagram(String a, String b) {
            a=a.toUpperCase();
            b=b.toUpperCase();
            if (a.length() != b.length()) return false;
            System.out.println("A: "+a);
            System.out.println("B: "+b);
        for(int i=0;i<a.length();i++)
        {
            char c =a.charAt(i);  //current character
            int countA=target(a,c);
            int countB=target(b,c);
            if(countA!=countB) return false;
        }
            return true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


//    adxy
//    bcgz

