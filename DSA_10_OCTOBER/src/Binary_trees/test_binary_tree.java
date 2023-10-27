package Binary_trees;

public class test_binary_tree {

    class Node{
        Node node;
        Node right;
        Node left;
        int value;
        Node(int value){
            this.value = value;
        }


    }
   private Node root;


    public void Display(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.value);

        Display(root.left);
        Display(root.right);

    }

    public void insert(int val, Node node){
        if(node == null){
            node = new Node(val);

        }

    }




    public static void main(String[] args) {

    }
}
