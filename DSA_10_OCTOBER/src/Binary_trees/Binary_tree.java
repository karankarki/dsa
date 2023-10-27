package Binary_trees;
import java.util.*;
public class Binary_tree {


    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value =value;
        }


    }

    private Node root;


    public void add_element(Scanner sc){
        System.out.println("Enter the root node :  ");
        int value = sc.nextInt();
        root = new Node(value);
        add_more(sc,root);

        display(root,"");
    }

    private static void add_more(Scanner sc,Node node){
        System.out.println("Do u want to enter in left :of "+node.value+"  ");
        boolean left  = sc.nextBoolean();

        if(left){
            System.out.println("Enter the value of left :  ");
            int value = sc.nextInt();
            node.left = new Node(value);
            add_more(sc,node.left);
        }




        System.out.println("Do u want to enter in right : of "+node.value+" ");
        boolean right  = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of right:  ");
            int value = sc.nextInt();

            node.right= new Node(value);
            add_more(sc,node.right);
        }



    }

    private static void display(Node node,String indent){

        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }


    public static void main(String[] args) {
Binary_tree t1 = new Binary_tree();
Scanner sc = new Scanner(System.in);
t1.add_element(sc);

    }
}
