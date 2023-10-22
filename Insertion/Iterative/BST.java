
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

        int x=78;
        root=insert(root,x);
        inorder(root);

    }
    public static Node insert(Node root, int x){
        Node temp=new Node(x);
        Node parent=null,curr=root;

        while(curr!=null){
            parent=curr;
            if(curr.key>x){
                curr=curr.left;
            }else if(curr.key<x){
                curr=curr.right;
            }
            else{
                return root;
            }
        }
        if(parent==null){
            return temp;
        }else if(parent.key>x){
            parent.left=temp;
        }else{
            parent.right=temp;
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
