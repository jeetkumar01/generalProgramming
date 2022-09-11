import java.util.Stack;

public class Inorder {

    Tree root;

    static class Tree{
        int data;
        Tree right,left;

        Tree(int d){
            data=d;
            right=left=null;
        }
    }

    public static void byRecur(Tree root){
        if(root==null){
//            System.out.println("");
            return;
        }

        byRecur(root.left);
        System.out.print(root.data+" ");
        byRecur(root.right);
    }

//    static void byIterative(Tree root){
//
//        Stack<Tree> s = new Stack<>();
//        Tree node =root;
//
//        while(true){
//            if(node!=null){
//                s.push(node);
//                node=node.left;
//            }else{
//                if(s.empty()){
//                    break;
//                }
//
//                node=s.pop();
//                System.out.print(node.data+" ");
//                node=node.right;
//            }
//        }
//    }

    static void byIterative(Tree root){
        Stack<Tree> s=new Stack<>();
        Tree node = root;
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }else{
                if(s.isEmpty()){
                    break;
                }else{
                    node=s.pop();
                    System.out.println(node.data);
                    node=node.right;
                }
            }
        }

    }




    public static void main(String[] args) {
        Inorder tree= new Inorder();
        tree.root=new Tree(1);
        tree.root.left=new Tree(2);
        tree.root.right=new Tree(3);
        tree.root.left.left=new Tree(4);
        tree.root.left.right=new Tree(5);

//        byRecur(tree.root);

        byIterative(tree.root);
    }
}
