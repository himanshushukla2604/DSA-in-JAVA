import java.util.*;
public class ReverseQueue {
    public static void Reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty())
            st.push(q.remove());

        while(!st.isEmpty())
            q.add(st.pop());
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Reverse(q);
        int size = q.size();
        for(int i = 0; i < size;i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }
}
