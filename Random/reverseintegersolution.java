class Solution1 {
    StringBuffer reversed= new StringBuffer();
    String original;
    int FinalAnswer;
    public int reverse(int x) {
        original = Integer.toString(x);
        if(x>0){
        for (int i = original.length()-1; i>=0; i--) {
            reversed.append(original.charAt(i));
        }
        String ans = reversed.toString();
        try {
            FinalAnswer = Integer.parseInt(ans);   
        } catch (Exception e) {
            FinalAnswer=0;
        }
    }
    else if(x<0){
        reversed.append('-');
        for (int i = original.length()-1; i>=1; i--) {
            reversed.append(original.charAt(i));
        }
        String ans = reversed.toString();
        try {
            FinalAnswer = Integer.parseInt(ans);   
        } catch (Exception e) {
            FinalAnswer=0;
        }
    }
    else{
        FinalAnswer = 0;
    }
    return FinalAnswer;
}
}
public class reverseintegersolution {
    public static void main(String[] args) {
        Solution1 sc = new Solution1();
        System.out.println(sc.reverse(9646));
    }   
}
/*
Most Suitable Answer
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}*/