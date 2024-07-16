package ARRAYSTRING;
//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
public class Product {
    public static void main(String[] args) {
        
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];


         // Step 1: Calculate prefix products and store them in the output array
        output[0] = 1;  // The first element has no left elements
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffixProduct;  // Multiply with the suffix product
            suffixProduct *= nums[i];  // Update the suffix product
        }
        return output;
    }
}
