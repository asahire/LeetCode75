class Solution {
    public int[] twoSum(int[] nums, int target) {

        // for(int i=0; i<nums.length; i++)
        // {
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i] + nums[j] == target)
        //         return new int[]{i,j};
        //     }
        // }

        //return null;
        
        // hashmap to store the difference between visited elements and target
        HashMap<Integer, Integer> hm = new HashMap<>();
         int difference;
        for(int i=0; i < nums.length; i++)
        {
           difference= target - nums[i];
            if(hm.containsKey(nums[i]))
            {
                return new int[] { hm.get(nums[i]), i};
            }
            else
            {
                hm.put(difference, i);
            }
        }
        return null;
    }
}