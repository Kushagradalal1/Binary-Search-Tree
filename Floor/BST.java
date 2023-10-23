class Node{
    int key;
    Node left, right;
    Node(int x){
        key=x;
    }
}
public class BST {
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(20);
        root.left.right=new Node(40);
        root.right=new Node(70);
        root.right.left=new Node(60);
        root.right.left.left=new Node(55);
        root.right.right=new Node(80);

        int x=35;
        System.out.println("Floor : "+(floor(root,x).key));

    }

    public static Node floor(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x){
                return root;
            }else if(root.key>x){
                root = root.left;
            }else{
                res=root;
                root = root.right;
            }
        }
        return res;
    }
}