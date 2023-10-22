class Node{
    int key;
    Node left, right;
    Node(int x){
        key=x;
    }
}
public class BSTDeletion {
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.right=new Node(40);
        root.right=new Node(70);
        root.right.left=new Node(60);
        root.right.right=new Node(80);

        //delete the element x=50..

        int x=50;

        root=delete(root,x);

        //printing 
        inorder(root);

    }

    public static Node delete(Node root, int x){
        if(root==null){
            return null;
        }else if(root.key>x){
            root.left= delete(root.left, x);
        }else if(root.key<x){
            root.right= delete(root.right, x);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                Node suc= getSuccessor(root);
                root.key=suc.key;
                root.right= delete(root.right, suc.key);
            }
        }
        return root;
    }

    public static Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}