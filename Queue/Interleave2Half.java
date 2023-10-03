
import java.util.Queue;
import java.util.LinkedList;

public class Interleave2Half {
    // Interleave 2 halves of the queue 
    // 1 2 3 4 5 6 7 8 9 10

    public static void Interleave(Queue<Integer> queue){
        int size = queue.size();
        Queue<Integer> queue2 = new LinkedList<>();

        for(int i = 0;i < size/2;i++){
            // System.out.println(queue.peek());
            queue2.add(queue.remove());
        }

        while(!queue2.isEmpty()){
            // System.out.println(queue2.peek());
            queue.add(queue2.remove());
            queue.add(queue.remove());
        }
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        Interleave(queue);
        int size = queue.size();
        for(int i = 0; i < size;i++){
            System.out.print(queue.peek() + " ");
            queue.add(queue.remove());
        }
    }
}
