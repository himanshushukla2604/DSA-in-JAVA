import java.util.*;
public class DequeAsStack {

    public static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public int top(){
            return deque.getLast();
        }

        public void push(int num){
            deque.addLast(num);
        }

        public void pop(){
            return deque.removeLast();
        }
    }

    public static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public int peek(){
            return deque.getFirst();
        }

        public void add(int num){
            deque.addLast(num);
        }

        public void remove(int num){
            return deque.removeFirst();
        }
    }
    public static void main(String[] args){

    }
}
