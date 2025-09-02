class Solution {
    public int reverse(int x) {
        long rev=0;
        
   int temp=Math.abs(x);
while (temp>0)
{
    int l=temp%10;
    rev=(rev*10)+l;
    temp=temp/10;
        
    }
    if(rev>Integer.MAX_VALUE)
    {
        return 0;
    }
    return x<0?(int)-rev:(int)rev;
}
}
