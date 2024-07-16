package ARRAYSTRING;
//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
public class GCDStrng {
    public static void main(String[] args) {
        
    }
    public String gcdOfStrings(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){   //which means str1 != str2+str2+str2+str2.................
            return " ";
        }
        int a = str1.length();
        int b = str2.length();
        int gcdLength = gcd(str1.length(), str2.length());


        //part of string whch can divded both strings.
        return str1.substring(0, gcdLength); 

    }


    public static  int gcd(int a   , int b ){
        while(b>0){
            int temp = b ;
            b = a%b;
            a= temp;
        }
        return a;
    }  // EUCLIDEAN FORMULA: gcd(a,b) == gcd(b , a % b)
    //another way : 
    public static int gcd1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
