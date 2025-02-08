class Solution {
    public boolean isPalindrome(int x) {
        String actual = Integer.toString(x);

        int left = 0, right = actual.length() -1;

        while(left < right)
        {
            if(actual.charAt(left) != actual.charAt(right)) return false;
            else 
            {
                left++;
             right--;
            }
        }
       
       return true;
    }
}