class Solution {
     private int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // map.put('I', 1);
        // map.put('V', 5);
        // map.put('X', 10);
        // map.put('L', 50);
        // map.put('C', 100);
        // map.put('D', 500);
        // map.put('M', 1000);

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

    //    int sum = 0;
    //     int n = s.length();
        
    //     for (int i = 0; i < n; i++) {
    //         int current = getValue(s.charAt(i));
            
    //         // Check if the next symbol represents a larger number
    //         if (i + 1 < n && current < getValue(s.charAt(i + 1))) {
    //             sum -= current;
    //         } else {
    //             sum += current;
    //         }
    //     }
    //     return sum;

    

    
        int sum = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int current = getValue(s.charAt(i));
            
            // Check if the next symbol represents a larger number
            if (i + 1 < n && current < getValue(s.charAt(i + 1))) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        return sum;
    }

   
}