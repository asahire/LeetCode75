class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m+n-1; //pointer at end of num1 array
    int pointer2 = m-1; // pointer at the end of num1 values
    int pointer3 = n-1; // pointer at the end of num2

    while(pointer3 >=0){
      if(pointer2>=0 && nums1[pointer2] > nums2[pointer3]){
        nums1[pointer1] = nums1[pointer2];
        pointer2--;
      } else {
        nums1[pointer1] = nums2[pointer3];
        pointer3--;
      }
      pointer1--;
    }
    }
}