class Solution3 {
    public boolean isValid(String s) {
        char[] arr;
        int count=0;
        boolean finalanswer = false;
        arr = s.toCharArray();
        if(arr[0]==')'||arr[0]==']'||arr[0]=='}'||arr[arr.length-1]=='('||arr[arr.length-1]=='['||arr[arr.length-1]=='{'){
            finalanswer=false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='('||arr[i]=='{'||arr[i]=='['){
                count++;
            }
            if(arr[i]==')'||arr[i]=='}'||arr[i]==']'){
                count--;
            }
        }
        if(count==0){
            finalanswer=true;
        }
        return finalanswer;
    }
}
public class validParenthesisSoln {
    public static void main(String[] args) {
        Solution3 sc = new Solution3();
        System.out.println(sc.isValid("()(){}"));
    }
}
