package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = null;
        head = push(head, 10);
        head = push(head, 20);
        head = push(head, 30);
        head = push(head, 40);
        head = push(head, 50);
        head = push(head, 60);
        head = deleteNode(head, 3);
        printList(head);

    }
    public static Node deleteNode(Node start, int k){
        if(k<1)
            return start;
        if(start==null)
            return null;
        if(k==1){
            Node res = start.next;
            return res;
        }
        start.next = deleteNode(start.next, k-1);
        return start;
    }
    public static Node push(Node head_ref, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head_ref;
        head_ref = newNode;
        return head_ref;
    }
    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("\n");
    }
}

