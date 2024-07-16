package ARRAYSTRING;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringAlternative{
    public static void main(String[] args) {
        
    }
    public String mergeAlternately1(String word1, String word2) {
        int i = 0;
        int j=  0;
        int l1=word1.length();
        int l2 = word2.length();
        StringBuilder merged = new StringBuilder();
        while(i<l1 || j<l2){
            if(i<l1){
                merged.append(word1.charAt(i));
                i++;
            }
            if(j<l2){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }
    public String mergeAlternately2(String word1, String word2) {
        int i = 0;
        int j=  0;
        int l1=word1.length();
        int l2 = word2.length();
        StringBuilder merge = new StringBuilder(); //String is immutable hence string builder is used.
        while(i < l1 && j < l2){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < l1 ){
            merge.append(word1.charAt(i));
            i++;
        }
        while( j < l2){
            merge.append(word2.charAt(j));
            j++;
        }
        return String.valueOf(merge);
    }
    
}