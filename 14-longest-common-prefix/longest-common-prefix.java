class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0) return "";

        // // horizontal scanning
        // String prefix = strs[0]; // assign first string as prefix
        
        // for(int i=1 ; i < strs.length; i++)
        // {
        // while(strs[i].indexOf(prefix) !=0)
        //     {
        //         prefix = prefix.substring(0, prefix.length() -1);

        //          if(prefix.isEmpty())  return "";
        //     }
        // }

        // return prefix;

        // we can use binary search for most efficient implementation
        int left = 0;
        int right = strs[0].length();

        while(left < right)
        {
            int mid = (left + right + 1) / 2;

            if(matchedPrefix(strs, mid))
            {
                left = mid;
            }
            else
            {
                right = mid -1;
            } 
        }

        return strs[0].substring(0, left);
    }

    private boolean matchedPrefix(String[] strs, int mid)
    {
        String prefix = strs[0].substring(0, mid);

        for(int i=1; i < strs.length; i++)
        {
            if(!strs[i].startsWith(prefix)) 
            return false;
        }

        return true;
    }
}