public class RemoveCycle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node head = null, tail = null;

    static public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast.next = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(flag){
            Node prev  = null;
            slow = head;
            while(fast!= slow){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev = null;
        }
    }
    public static void main(String[] args){
       head  = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       head.next.next.next = new Node(40);
       head.next.next.next.next = head;

       removeCycle();
       Node temp = head;
       while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
       }
       
    }
}