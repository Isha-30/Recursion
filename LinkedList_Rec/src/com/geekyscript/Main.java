package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);
        traverse(head);

    }
    public static Node newNode(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }

    public static Node insertEnd(Node head, int data){
        if(head == null) return newNode(data);
        else
            head.next = insertEnd(head.next, data);
        return head;
    }

    public static void traverse(Node head){
        if(head == null) return;
        System.out.println(head.data);
        traverse(head.next);
    }

}
