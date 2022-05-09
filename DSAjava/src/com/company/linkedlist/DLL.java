package com.company.linkedlist;

public class DLL {
    Node head;
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
        head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.println(node.val + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        while(last!=null){
            System.out.println(last.val + " ");
            last = last.prev;
        }

    }
    public void insert(int after,int val){
        Node temp = head;
        Node node = new Node(val);
        while(temp.next.val != after){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("does not exist");
            return;
        }

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next!= null){
        node.next.prev = node;}

    }
    public void insetlast(int val){
        Node node = new Node(val);
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;


    }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
