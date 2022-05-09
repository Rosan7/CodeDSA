package com.company.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(14);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }
    public int deleteindex(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public Node find(int value) {
        Node node = head;

        while(node !=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }
    public void insertRec(int index,int val){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
       if(index == 0){
           Node temp = new Node(val,node);
           size ++;
           return temp;
       }
       node.next = insertRec(val,index--,node.next);
       return node;
    }
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast = get(size -2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            Insertlast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
    public void Insertlast(int value){
        if(tail == null){
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");


    }
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node (int value, Node next){
            this.value = value;
            this.next = next;
       }
    }
//    public static LL merge(LL first,LL second){
//        Node f = first.head;
//        Node s = second.head;
//        LL ans = new LL();
//        while(f!= null && s!=null){
//            if(f.value < s.value){
//                ans.Insertlast(f.value);
//                f = f.next;
//            }
//            else{
//                ans.Insertlast(s.value);
//                s = s.next;
//            }
//        }
//        while(s ! = null){
//            ans.Insertlast(s.value);
//            s = s.next;
//        }
//        while(f != null){
//            ans.Insertlast(f.value);
//            f = f.next;
//        }
//    }
    public static LL merge(LL first,LL second) {
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f != null && s != null) {
            if (f.value > s.value) {
                ans.Insertlast(s.value);
                s = s.next;
            } else {
                ans.Insertlast(f.value);
                f = f.next;
            }
        }
        while (f != null) {
            ans.Insertlast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.Insertlast(s.value);
            s = s.next;
        }
        return ans;
    }
    public void Bubblesort(){
        Bubblesort(size-1,0);
    }
    private void Bubblesort(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.value > second.value){
            if(first == head){
                head = second;
                first.next = second.next;
                second.next = first;
            }
            else if(second == tail){
                Node prev = get(col-1);
                prev.next = second;
                tail = first;
                first.next = null;
                second.next = tail;
            }
            else{
                Node prev = get(col-1);
                prev.next = second;
                first.next = second.next;
                second.next = first;
            }
        }
    Bubblesort(row,col+1);
    }
        else{
            Bubblesort(row-1,0);
        }}
    public Node reversebetween(Node head,int left,int right){
        Node current = head;
        Node prev = null;
        if(left == right){
            return head;
        }
        for(int i =0;current!=null && i<left-1;i++){
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newend = current;
        Node next = current.next;
        for(int j=0;current!=null && j<right-left+1;j++){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        if(last!=null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newend.next = current;
        return head;
    }
//    public Node sort(Node head){
//        if(head == null || head.next == null) {
//            return head;
//        }
//        Node midnode = (head);
//    }
//    public Node findmid(Node head){
//
//    }
    public Node reverseLL(Node node){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = node;
        Node temp = curr.next;
        while(curr != null){
            curr.next = prev;
            curr = prev;
            temp = curr;
            if(temp.next!=null){
                temp = temp.next;
            }
        }
        return prev;
    }
    public void reverserecurse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverserecurse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public Node findmid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public Boolean palindromelist(Node head){
        Node midNode = findmid(head);
        Node reversedhead = reverseLL(midNode);
        Node temp = head;
        while(temp!=null && reversedhead!=null){
            if(temp.value != reversedhead.value){
                break;
            }

                temp = temp.next;
                reversedhead = reversedhead.next;

        }
        if(temp!=null || reversedhead!=null){
            return false;
        }
        else{
            return true;
        }

    }
    public void reorderlist(Node head){
        Node mid = findmid(head);
        Node hs = reverseLL(mid);
        Node hf = head;
        while(hf!=null && hs!=null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }}
        public Node reverseknodes(Node head,int k){
            if(k<=1 || head == null){
                return head;
        }
            Node prev = null;
            Node curr = head;
            while(true){
                Node last = prev;
                Node newEnd = curr;
                Node next = curr.next;
                for(int i =0;curr!=null && i<k;i++){
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    if(next!=null){
                        next = next.next;
                    }
                }
                if(last!=null){
                    last.next = prev;
                }
                else{
                    head = prev;
                }
                newEnd.next = curr;
                return head;
            }

    }
    public Node rotatelist(Node head,int r) {
        int length = 0;
        Node node = head;
        while (node != null) {
            node = node.next;
            length++;
        }
        if (head == null || head.next == null || r == 0) {
            return head;
        }
        int rotate = r % length;
        for (int i = 1; i < length - rotate; i++) {
            node = node.next;
        }
        Node newnode = node.next;
        node.next = null;
        while (newnode.next != null) {
            newnode = newnode.next;
        }
        newnode.next = head;
        return head;
    }

}
