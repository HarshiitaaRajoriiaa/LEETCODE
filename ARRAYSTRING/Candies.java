package ARRAYSTRING;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
public class Candies {
    public static void main(String[] args) {
        
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr  = new ArrayList<>(); //Array will store true or false as asked by question
        int n = candies.length;
        int index = 0;
        int max = 0; //manage maximum candies after adding extra candies.
        for(int i = 0; i <n ;i++){
            max = Math.max(max, candies[i]);
        }
        for(int i = 0; i <n ;i++){
            arr.add(candies[i] + extraCandies >= max);
        }
        return arr;
    }
}
