import java.util.Stack;

public class Preorder {
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    static void preByRec(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preByRec(root.left);
        preByRec(root.right);
    }

//    static void preByIterative(Node root){
//        if(root==null) return;
//
//        Stack<Node> s=new Stack<>();
//        s.push(root);
//         while(s.empty()==false){
//
//             Node myNode = s.pop();
//             System.out.print(myNode.data+" ");
//
//             if(myNode.right!=null){
//                 s.push(myNode.right);
//             }
//             if(myNode.left!=null){
//                 s.push(myNode.left);
//             }
//         }
//    }

    static void preByIterative(Node root){
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node node=st.pop();
            System.out.println(node.data);
            if(node.right!=null){
                st.push(node.right);
            }
            if(node.left!=null){
                st.push(node.left);
            }
        }
    }


    public static void main(String[] args) {
        Preorder porder=new Preorder();
        porder.root=new Node(1);
        porder.root.left=new Node(2);
        porder.root.right=new Node(3);
        porder.root.left.left=new Node(4);
        porder.root.left.right=new Node(5);
//        preByRec(porder.root);

        preByIterative(porder.root);
    }
}
