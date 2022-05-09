package com.company.linkedlist;

public class CLL {
    private Node head;
    private Node tail;
    public CLL(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.println(node.value + " -> ");
                node = node.next;
            }while(node != head);

        }
    }
    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);


    }
    private class Node{
        int value;
        Node next;
        public Node(int val){
            this.value = value;
        }
    }
}
