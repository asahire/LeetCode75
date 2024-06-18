import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i=0 ; i < nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                count = hm.get(nums[i]) + 1;
                hm.put(nums[i], count);
            }
            else
            {
                hm.put(nums[i], 1);
            }

            if(hm.get(nums[i]) > (nums.length/2))
            {
                return nums[i];
            }
        }
        return 0;
    }
}