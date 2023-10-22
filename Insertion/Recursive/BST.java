//insertion in a tree with the help of recursive method :

class Node{
    int key;
    Node left, right;
    Node(int x){
        key=x;
    }
}
public class BST {
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);

        //insert the element :
        int x=4;

        root=insert(root,x);
        inorder(root);
    }

    public static Node insert(Node root, int x){
        if(root==null){
            return new Node(x);
        }else if(root.key<x){
            root.right= insert(root.right, x);
        }else{
            root.left= insert(root.left, x);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}