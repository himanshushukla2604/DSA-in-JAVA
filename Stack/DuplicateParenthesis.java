import java.util.Stack;
public class DuplicateParenthesis {

    public static boolean duplicateParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch!= ')'){
                stack.push(ch);
            }else{
                int count = 0;
                while(stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                if(count < 1){
                    return false;
                }
                stack.pop();
            }
            
        }
        return true;
    }
    public static void main(String[] args){
        String str = "(((a+b))+(c+d))";
        System.out.println(duplicateParenthesis(str));
    }
}
