package Linked_list;

import java.sql.SQLOutput;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static void Display(Node head){
        while(head!=null){
            System.out.print(head.data+"  ");
            head = head.next;
        }
    }


    public static int mid_point(Node head){
        Node temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp = head;

        int k = 0;
//        System.out.println(temp.data);
        while(k<n/2){
//            System.out.println(k);
            temp = temp.next;
            k++;
        }
        return temp.data ;

    }
}
public class mid_point_linked_List extends Node {

    public mid_point_linked_List(int data) {
        super(data);
    }

    public static void main(String[] args) {
        Node l1 = new Node(10);
        Node l2 = new Node(20);
        Node l3 = new Node(30);
        Node l4 = new Node(40);
        Node l5 = new Node(50);
        Node l6 = new Node(60);
        Node l7 = new Node(70);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

//        Display(l1);

        System.out.println(mid_point(l1));


    }
}
