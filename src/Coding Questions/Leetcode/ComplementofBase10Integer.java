/**
 * 476. Number Complement
Solved
Easy
Topics
Companies
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Constraints:

1 <= num < 231

1009. Complement of Base 10 Integer
Solved
Easy
Topics
Companies
Hint
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.

 

Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
Example 2:

Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
Example 3:

Input: n = 10
Output: 5
Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 

Constraints:

0 <= n < 109
 

Note: This question is the same as 476: https://leetcode.com/problems/number-complement/
 */

public class ComplementofBase10Integer {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        StringBuilder s = new StringBuilder("");
        while(n>0){
            if(n%2==1){
                s.append(0);
            }
            else{
                s.append(1);
            }
            
            n=n/2;
        }
        s.reverse();
        
        //approach 1
        // int num=0;
        // for(int i=0;i<s.length();i++){
        //     num+=Integer.parseInt(s.charAt(i)+"")*Math.pow(2,s.length()-1-i);
        // }
        

        // return num;

        //approach 2
        return Integer.parseInt(s.toString(),2);

        


    }
}
