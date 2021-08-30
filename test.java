import java.util.Stack;

class Solution4 {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<Character>();
            for(int i=0;i<s.length();i++) {
                char top = st.empty() ? '#' : st.lastElement();
                
                if(top == '(' && s.charAt(i) == ')') {
                    st.pop();
                }else if(top == '{' && s.charAt(i) == '}') {
                    st.pop();
                }else if(top == '[' && s.charAt(i) == ']') {
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }    
            }
            
            return st.empty();
        }
    }
    public class test {
        public static void main(String[] args) {
            Solution3 sc = new Solution3();
            System.out.println(sc.isValid("()({)}{}"));
            System.out.println(sc.isValid("([)]"));
        }
    }
    