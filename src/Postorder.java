import java.util.Stack;

public class Postorder {
    Node root;
    static class Node{
        int data;
        Node right,left;
        Node(int d){
            data=d;
            right=left=null;
        }
    }

    static void postByRec(Node root){
        if(root==null){
            return;
        }

        postByRec(root.left);
        postByRec((root.right));
        System.out.print(root.data+" ");
    }

//    static void postByIterative(Node root){
//
//        Stack<Node> s1=new Stack<>();
//        Stack<Node> s2=new Stack<>();
//        s1.push(root);
//        while(s1.empty()==false){
//            Node myNode = s1.pop();
//            s2.push(myNode);
//            if(myNode.left!=null){
//                s1.push(myNode.left);
//            }
//
//            if(myNode.right!=null){
//                s1.push(myNode.right);
//            }
//        }
//
//        while(s2.empty()==false){
//            Node myNode =s2.pop();
//            System.out.print(myNode.data+" ");
//        }
//
//
//    }

 static void postByIterative(Node root){
        Stack<Node> s1=new Stack<>();
     Stack<Node> s2=new Stack<>();
     s1.push(root);
     while(!s1.isEmpty()){
         Node node=s1.pop();
         s2.push(node);
         if(node.left!=null){
             s1.push(node.left);
         }
         if(node.right!=null){
             s2.push(node.right);
         }
     }

     while(!s2.isEmpty()){
         Node node=s2.pop();
         System.out.println(node.data);
     }

 }

    public static void main(String[] args) {
        Postorder porder=new Postorder();
        porder.root=new Node(1);
        porder.root.left=new Node(2);
        porder.root.right=new Node(3);
        porder.root.left.left=new Node(4);
        porder.root.left.right=new Node(5);

//        postByRec(porder.root);

        postByIterative(porder.root);
    }
}
