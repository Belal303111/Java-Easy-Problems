class Solution {
    public int climbStairs(int n) {
       int a=1,b=2,c=0;
       if(n==a ||n==b) return n;
       else{
        for(int i=3;i<=n;i++)
            {
            c=a+b;
            a=b;
            b=c;
            }
       }
        return c;
       }
    }