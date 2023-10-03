// As we all know that push opration is performed on top of the stack
// in this question we have to perform push opration in bottum of the stack
import java.util.*;

public class PushAtTheBottom {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty())
                return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size() - 1);
        }

        public static void pushInButtom(int data){
            if(isEmpty()){
                
                push(data);
                return;
            }

                int top = pop();
                pushInButtom(data);
                push(top);
            

        }
   
        public static void printStack(){
            for (Integer i: list) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pushInButtom(0);
        stack.printStack();
    }    
}
