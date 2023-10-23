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

        //ceiling of 58 :

        int x=58;

        System.out.println("Ceil : "+ceil(root,x).key);

    }

    public static Node ceil(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key>x){
                res=root;
                root=root.left;
            }else{
                root= root.right;
            }
        }
        return res;
    }
}