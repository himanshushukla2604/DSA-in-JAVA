import java.util.ArrayList;

public class ReverseStack {
    public static class Stack{
        static ArrayList<Integer> stack = new ArrayList<>();
        
        public static boolean isEmpty(){
            return stack.size() > 0;
        }
        public static void push(int data){
            stack.add(data);
        }

        public static int pop(){
            if(stack.isEmpty())
                return -1;
            
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        public static int peek(){
            if(stack.isEmpty())
                return -1;
           
            return stack.get(stack.size()-1);
        }

        
        public static void printStack(){
            for (Integer i: stack) {
                System.out.print( i+ " ");
            }
            System.out.println();
        }
    }

    public static void pushAtBottom(int data){
        if(!Stack.isEmpty()){
            Stack.push(data);
            return;
        }
        int num = Stack.pop();
        pushAtBottom(data);
        Stack.push(num);
    }

    public static void reverseStack(){
        if(!Stack.isEmpty()){
            return;
        }
        int data = Stack.pop();
        reverseStack();
        pushAtBottom(data);
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.print("Actual Stack : ");
        Stack.printStack();

        reverseStack();
        System.out.print("Reversed stack : ");
        Stack.printStack();
    }
}
