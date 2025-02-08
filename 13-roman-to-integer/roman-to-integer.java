class Solution {
       public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // int length =s.length();
        // int numericValue=0;

        // while(length > 0)
        // {   
        //    // if(length == 1) return numericValue + map.get(s.charAt(length-1));

        //     char romanChar = s.charAt(length-1);
        //     // System.out.println(romanChar);
        //     numericValue += map.get(romanChar);

        //     // handle special cases of IV, XC etc.
        //     if(length >= 2)
        //     {
        //         if(map.get(romanChar) > map.get(s.charAt(length-2)))
        //         {
        //             numericValue -= map.get(s.charAt(length-2));
        //             length--;
        //         }
        //     }

        //     length--;    
        // }

        // return numericValue;

              int total = 0;
        int prevValue = 0; // Keep track of the last Roman numeral value

        // Step 2: Iterate through the string
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));

            // Step 3: Check if we need to subtract or add the value
            if (currValue < prevValue) {
                total -= currValue; // Subtract
            } else {
                total += currValue; // Add
            }

            prevValue = currValue; // Update previous value
        }

        return total;
  }
}