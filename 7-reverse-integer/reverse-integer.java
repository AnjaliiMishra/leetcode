class Solution {
    public int reverse(int x) {
    int revno=0;
    int num=x;

    while(num!=0)
    {
         int ld=num%10;
        if(revno>Integer.MAX_VALUE/10  ||revno<Integer.MIN_VALUE/10)
        {
            return 0;
        }
        revno=revno*10+ld;
        num=num/10;
    } 
    return revno;
    }
}