class Node{
    int key;
    Node left, right;
    Node(int x){
        key=x;
    }
}

public class BST {
    public static void main(String[] args) {
        Node root=new Node(80);
        root.left=new Node(70);
        root.left.left=new Node(60);
        root.right=new Node(90);
        root.left.right=new Node(75);
        root.right.left=new Node(85);
        root.right.right=new Node(100);

        if(isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE)){
            System.out.println("Is BST");
        }else{
            System.out.println("Not a BST");
        }
    }

    public static boolean isBST(Node root, int min, int max){
        if(root==null){
            return true;
        }else{
            return (root.key>min && root.key<max && isBST(root.left,min,root.key) && isBST(root.right,root.key,max));
        }
    }
}
