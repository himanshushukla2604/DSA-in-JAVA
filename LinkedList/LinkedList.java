import java.util.Scanner;
public class LinkedList{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null, tail = null;
  
    public void addData(int num){
        Node node = new Node(num);
        
        if(head == null){
            head = tail = node;
            return;
        }

        tail.next = node;
        tail = node;
        
    }

    public Node addDataGetNode(int num){
        Node node = new Node(num);
       
        if(head == null){
            head = tail = node;
            return head;
        }

        tail.next = node;
        tail = node;
        return tail;
        
    }

    
    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +  " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverseLinkedList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthNode(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next; // remove first
            return;
        }

        int i = 1;
        int idxToFind = size-n;
        Node prev = head;
        while(i < idxToFind){
            i++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(){
        Node slow = head;
        Node fast = head;
        Node prev = slow;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }

    public boolean checkPalindrome(){
        // base case
        if(head == null || head.next == null)
            return true;
        // 1. claculate the mid 
        Node midNode = findMid();
        
        // 2. reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next ;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // 3. compare and return answer
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        
    }

    public  Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);
        Node rHead = mid.next;
        mid.next = null;
        
        
        return merge(mergeSort(head), mergeSort(rHead));
    }
 
    public Node merge(Node lhead , Node rhead){
        Node mergedll = new Node(-1);
        Node temp  = mergedll;
        while(lhead != null && rhead != null){
            //System.out.println(lhead.data + " " + rhead.data);
            if(lhead.data <= rhead.data){
                temp.next = lhead;
                lhead = lhead.next;
                temp = temp.next;
            }else{
                temp.next = rhead;
                rhead = rhead.next;
                temp = temp.next;
            }
        }
        while(lhead != null ){
                temp.next = lhead;
                lhead = lhead.next;
                temp = temp.next;
        }
        while(rhead != null){
                temp.next = rhead;
                rhead = rhead.next;
                temp = temp.next;
        }
        return mergedll.next;
    }

    public void zigzag(){
        //  find mid
        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node rhead = slow.next;
        mid.next = null;

        // reverse second half
        Node prev = null;
        Node curr = rhead;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        rhead = prev;
        Node lhead = head;
        // alternate merge or zig-zak merge
        Node nextL, nextR;
        while(head != null && rhead!= null){
            nextL = lhead.next;
            lhead.next = rhead;
            nextR = rhead.next;
            rhead.next = nextL;

            lhead = nextL;
            rhead = nextR;
        }
        
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addData(10);
        ll.addData(9);
        ll.addData(8);
        ll.addData(7);
        ll.addData(6);
        ll.addData(5);
        ll.addData(4);
        ll.printLinkedList();
        //ll.reverseLinkedList();
        //ll.printLinkedList();
        //System.out.println(ll.checkPalindrome());
       ll.head = ll.mergeSort(ll.head);
        System.out.print("Merge Sort Linked List : ");
       ll.printLinkedList();

       // zigzak LinkedList
       ll.zigzag();
       System.out.print("Zig-Zak Linked List : ");
       ll.printLinkedList();
    }
}