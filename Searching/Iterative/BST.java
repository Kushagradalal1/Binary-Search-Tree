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
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);

        int x=18;

        if(search(root,x)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

    public static boolean search(Node root, int x){
        while(!(root==null)){
            if(root.key==x){
                return true;
            }else if(root.key>x){
                root = root.left;
            }else if(root.key<x){
                root = root.right;
            }   
        }
        return false;
    }
}