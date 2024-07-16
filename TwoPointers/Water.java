package TwoPointers;
//https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75
public class Water {
    public static void main(String[] args) {
        
    }
    public int maxArea(int[] height) {
        int left = 0 ;
        int right= height.length-1;
        int maxVolume = 0;
        while(left<=right){
            int currVolume = Math.min(height[left], height[right]) * (right - left);
            maxVolume = Math.max(maxVolume, currVolume);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVolume;
    }
}

