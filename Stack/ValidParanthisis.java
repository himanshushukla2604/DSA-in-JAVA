import java.util.Stack;
public class ValidParanthisis {

    public static boolean isValid(String s){
       
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' )
                stack.push(ch);
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(ch == ')' && stack.peek() == '(' || ch == '}' && stack.peek() == '{' || ch == ']' && stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;

    }

    

    public static void main(String[] args){
        String s = "{((){}[])}";
        System.out.println(isValid(s));
    }
}
