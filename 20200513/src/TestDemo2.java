import java.util.Stack;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200513
 * @Description:
 * 括号匹配问题
 * @USer:LD
 * @Date: 2020-05-14 13:14
 * @time: 13:14
 **/
public class TestDemo2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.length() == 0) {
                return true;
            }
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.empty()) {
                    return false;
                }else if((ch == ')'&&stack.peek()=='(') ||(ch == ']'&&stack.peek()=='[') ||(ch == '}'&&stack.peek()=='{')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
       if (stack.empty()) {
           return true;
       }else {
           return false;
       }
    }
}
