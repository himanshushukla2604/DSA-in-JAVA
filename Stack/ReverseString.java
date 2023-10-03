import java.util.ArrayList;

public class ReverseString {
    static class Stack{
        static ArrayList<Character> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(char data){
            list.add(data);
        }

        public static char pop(){
            if(isEmpty())
                return ' ';
            char top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static char peek(){
            return list.get(list.size() - 1);
        }

        
   
        public static void printStack(){
            for (Character i: list) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args){
        Stack s = new Stack();
        String str = "ramu";
        for(int i = 0; i< str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i < str.length();i++){
            char curr = s.pop();
            sb.append(curr);
        }
        System.out.println(sb);
    }
}
