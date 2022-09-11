import java.util.HashSet;

public class LoopDetect {
    Node head;

    static class Node{
        int data;
        Node next;
        int flag;
        Node(int d){
            data=d;
            next=null;
            flag=0;
        }
    }

    public static void detectByHash(Node h){
        HashSet<Node> hash=new HashSet<>();

        while(h!=null){
            if(hash.contains(h)){
                System.out.println("True");
                return;
            }

            hash.add(h);
            h=h.next;
        }
        System.out.println("False");
    }


    public static void detect(Node h){
        while(h!=null){
            if(h.flag==1){
               System.out.println("True");
               return;
            }
            h.flag=1;
            h=h.next;
        }
        System.out.println("False");
    }

    public static void main(String [] args){
        LoopDetect lp=new LoopDetect();
        lp.head=new Node(2);
        Node second=new Node(3);
        lp.head.next=second;
        second.next=lp.head;
//        detect(lp.head);

        detectByHash(lp.head);
    }
}
