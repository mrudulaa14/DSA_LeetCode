2)REVERSE

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

SOLUTION:

class Solution {
    public int reverse(int x) {
        int revNum= 0;
        while(x !=0){
            int lastDigit= x % 10;
            if (revNum > 214748364 || (revNum == 214748364 && lastDigit > 7)) return 0;
            if (revNum < -214748364 || (revNum == -214748364 && lastDigit < -8)) return 0;
            revNum=(revNum * 10)+lastDigit;
            x = x / 10;
        }
        return revNum;
    }
}

