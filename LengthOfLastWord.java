class Solution {
    public int lengthOfLastWord(String s) {
         int i=s.length()-1;
      if(s.charAt(i)==' ')
        while(s.charAt(i)==' ')
            i--; 
        int c=0;
        while(s.charAt(i)!=' ' && i>0)
            {
                c++;
                i--;
            }
            if(s.charAt(i)!=' ') c++;
             return c;
    }
}