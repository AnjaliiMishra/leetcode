class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        if (x < 0) return false; // negative numbers can't be palindrome

        int rev = 0;
        while (x > 0) {
            int a = x % 10;
            rev = (rev * 10) + a;
            x = x / 10;
        }

        return rev == original;
    }
}
