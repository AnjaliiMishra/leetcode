class Solution {
    public boolean isPalindrome(int x)
     {
        int num=x;
        int original=num;
        int revno=0;

        while (num!=0)
        {
            int ld=num%10;
            revno=revno*10+ld;
            num=num/10;
        } 
        if (original<0)
        {
          return false;
        }
        else if (revno == original)
        {
             return true;
        }
        else
        {
             return false;
        }
     }
}

        
    
