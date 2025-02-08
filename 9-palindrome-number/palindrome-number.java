class Solution {
    public boolean isPalindrome(int x) {
    //     String actual = Integer.toString(x);

    //     int left = 0, right = actual.length() -1;

    //     while(left < right)
    //     {
    //         if(actual.charAt(left) != actual.charAt(right)) return false;
    //         else 
    //         {
    //             left++;
    //          right--;
    //         }
    //     }
       
    //    return true;

    if(x < 0) return false;

    int reverse=0;
    int actual=x;
    while(x > 0)
    {
        int mod = x % 10;
        reverse= reverse * 10 + mod;
        x/=10;
    }

    return reverse == actual;
    }
}