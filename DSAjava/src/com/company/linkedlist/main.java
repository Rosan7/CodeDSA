package com.company.linkedlist;

import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
        LL list = new LL();
        // LL is a custom linked list..
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.display();
//        DLL list = new DLL();
//        list.insertfirst(10);
//        list.insertfirst(9);
//        list.insertfirst(8);
//        list.display();
    }
}
