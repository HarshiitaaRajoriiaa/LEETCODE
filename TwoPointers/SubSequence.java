package TwoPointers;
//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class SubSequence {
    public static void main(String[] args) {
        
    }
    public boolean isSubsequence(String s, String t) {
        boolean result = false;
        int l1 = s.length(); //small
        int l2 = t.length(); //big
          // An empty string s is always a subsequence of any string t.
        if (l1 == 0) {
            return true;
        }
        // If t is empty but s is not, s can't be a subsequence of t.
        if (l2 == 0) {
            return false;
        }
        int i = 0; //matching char pointer in s
        int j = 0 ;  //matching char pointer in t
        while (j < l2) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;

                
                // If we have matched all characters of s, return true
                if (i == l1) {
                    return true;
                }
            }
            j++;
        }
        return result;
    }
}
