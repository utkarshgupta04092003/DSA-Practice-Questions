/******************************************************************************************
Check Palindrome (recursive)
Send Feedback
Check whether a given String 'S' is a palindrome using recursion.


Return true or false.


Note:
You don’t need to print anything. Just implement the given function.
Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.
Input Format:
The first and only line of the input contains string S.
Output format:
Return a boolean value True or False.
Sample Input 1:
abbba
Sample Output 1:
true
Explanation Of Sample Input 1 :
“abbba” is a palindrome
Sample Input 2:
abcd
Sample Output 2:
false
Explanation Of Sample Input 2 :
“abcd” is not a palindrome.
Constraints:
0 <= |S| <= 10^6
where |S| represents the length of string S.

******************************************************************************************/



public class Solution {
    private static boolean isPalindrome(int left, int right, String str){
        if(str.charAt(left) != str.charAt(right))
            return false;
        if(left >= right)
            return true;

        return isPalindrome(left+1,right-1,str);
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalindrome(0,str.length()-1, str);
    }
}


