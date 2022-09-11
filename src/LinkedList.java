public class LinkedList{
    Node head;
 static class Node{
     int data;
     Node next;
     Node(int d){
         data=d;
         next=null;
     }
 }

 public void printList(){
     Node n=head;
     while(n!=null){
         System.out.println(n.data);
         n=n.next;
     }
    }

    public void pushAtFirst(int a){
     Node newNode=new Node(a);
    newNode.next=head;
        head=newNode;

    }

    public void pushAfter(Node prev_node,int a){
     if(prev_node==null){
         return;
     }

     Node newNode = new Node(a);
     newNode.next=prev_node.next;
     prev_node.next=newNode;
    }

    public void pushLast(int a){
        Node newNode=new Node(a);
     if(head==null){
         head=new Node(a);
         return;
     }


     newNode.next=null;
    Node last=head;
     while(last.next!=null){
         last=last.next;
     }

     last.next=newNode;
return;

    }

    public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }

 public static void main(String[] args){
     LinkedList list=new LinkedList();
     list.head=new Node(1);
     Node second=new Node(2);
     list.head.next=second;


     list.pushAtFirst(3);
     list.pushAfter(second,4);
     list.pushLast(5);
     list.printList();
     System.out.println(list.getCountRec(list.head));
 }
}