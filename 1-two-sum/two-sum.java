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

        System.gc();
        // hashmap to store the difference between visited elements and target
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for(int i=0; i < nums.length; i++)
        {
            //int difference= target - nums[i];
            if(map.containsKey(target - nums[i]))
            {
                return new int[] { map.get(target - nums[i]), i};
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

          // If no pair found, return an empty array or throw an exception
        return new int[]{-1, -1};
    }
}