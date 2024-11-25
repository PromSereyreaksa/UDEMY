class Solution {
    public boolean isPalindrome(int x) {
    /*
    x = 121              reverse number = 0
    x    last digit      reverse number
                         reversed number * 10 + last digit
    x                    reverse number
    121- 121 % 10 = 1    0 * 10 + 1 = 1
    12- 12 % 10 = 2      1 * 10 + 2 = 12
    1- 1 % 10 = 1       12 * 10 + 1 = 121
    1/10 = 0 finish
    if x isnt = 0 = is not done
         */
        int reverse = 0;
        int temp = x;
        if(x<0){
            return false;
        }
        while(temp!=0){
            reverse=reverse*10+temp;

        }
        return reverse == x;
    }

}