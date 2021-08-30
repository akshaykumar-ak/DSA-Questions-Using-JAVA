class solution2 {
    public boolean isPalindrome(int x) {
        int pop = 0;
        boolean finalAnswer=false;
        int temp = x;
        int rev = 0;
        if (x < 0) {
            finalAnswer = false;
        }
        if (x >= 0) {
            while (temp != 0) {
                pop = temp % 10;
                temp = temp / 10;
                rev = (rev * 10) + pop;
            }
            if (rev==x) {
                finalAnswer=true;
            }
        }
        return finalAnswer;

    }
}

public class palindromesolution {
    public static void main(String[] args) {
        solution2 sc = new solution2();
        System.out.println(sc.isPalindrome(1234));
    }
}

/**
 * palindromesolution
 * 
 public class Solution {
    public bool IsPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}
 */