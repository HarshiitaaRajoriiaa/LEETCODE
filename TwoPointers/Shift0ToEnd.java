package TwoPointers;
//https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
public class Shift0ToEnd {
    public static void main(String[] args) {
        
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZeroFoundAt = 0; // Pointer for the last non-zero element
    
        // If the current element is not zero, then we need to append it just in front of the last non-zero element we found.
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }
    
        // After we have finished processing new elements, all the non-zero elements are already at the beginning of the array.
        // We just need to fill the remaining array with 0's.
        for (int i = lastNonZeroFoundAt; i < n; i++) {
            nums[i] = 0;
        }
    }
}

