package com.company.trees;

import java.util.*;

public class Tree {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node head = createTree();
//        System.out.println(symmetrictree(head));
//        System.out.println(countnodes(head));
//        System.out.println(findheight(head));
       System.out.println(zigzagorder(head));
// System.out.println(verticalorder(head));
    }
    static Node createTree(){
        Node root;
        System.out.println("Enter data : ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left for : " + data);
        root.left = createTree();
        System.out.println("Enter right for : " + data);
        root.right = createTree();
        return root;
    }
    static ArrayList<Integer> lvltrav(Node head){
        Queue<Node> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(head == null){
            return ans;
        }
        q.add(head);
        while(!q.isEmpty()){
            Node f = q.peek();
            q.remove();
            if(f.left != null){
                q.add(f.left);
            }
            if(f.right != null){
                q.add(f.right);
            }
        }

        return ans;
    }
    static List<List<Integer>> zigzag(Node head){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
       if(head == null){
           return ans;
       }
       Queue<Node> q = new ArrayDeque<>();
       q.add(head);
       boolean l2r = true;
       while(!q.isEmpty()){
           int size = q.size();
           List<Integer> curr = new ArrayList<>(size);
           for(int i = 0;i<size;i++){
               Node f = q.peek();
               q.remove();
               int index = l2r ? i : (size-i-1);
               curr.add(index,f.data);
               if(f.left != null){
                   q.add(f.left);

               }
               if(f.right != null){
                   q.add(f.right);
               }
           }
           l2r = !l2r;
           ans.add(curr);
       }
       return ans;
    }
    static List<Integer> zigzagorder (Node head){
        Deque<Node> dq = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        if(head == null){
            return ans;

        }
        ans.add(head.data);
        dq.add(head);
        Node temp;
        boolean l2r = true;
        while(!dq.isEmpty()){
            int n = dq.size();
            for(int i=0;i<n;i++){
                if(l2r){
                  temp = dq.peekFirst();
                  dq.removeFirst();
                }
                else{
                    temp = dq.peekLast();
                    dq.removeLast();
                }
                // now work is to insert elements
                if(l2r){
                    if(temp.right != null){
                        dq.addLast(temp.right);
                        ans.add(temp.right.data);
                    }
                    if(temp.left != null){
                        dq.addLast(temp.left);
                        ans.add(temp.left.data);
                    }
                }
                else if (l2r == false){
                    if(temp.left != null){
                        dq.addFirst(temp.left);
                        ans.add(temp.left.data);
                    }
                    if(temp.right != null){
                        dq.addFirst(temp.right);
                        ans.add(temp.right.data);
                    }

                }
            }
            l2r = !l2r;
        }
        return ans;
    }
   //statc reverseorder just same as reversed answer of level order
    static List<List<Integer>> reverseorder(Node head){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Deque<Node> q = new ArrayDeque<>();
        ArrayList<Integer> curr = new ArrayList<>();
        if(head == null){
            return ans;
        }
        q.add(head);
        Node node2 = new Node(-3);
        q.add(node2);

        while(!q.isEmpty()){
            Node f = q.peek();
            q.removeFirst();
            if(f.data == node2.data){
                ans.add(curr);
                curr = new ArrayList<>();
                if(!q.isEmpty()){
                    q.addLast(node2);
                }
            }
            else{
            curr.add(f.data);
            if(f.left != null){
                q.add(f.left);
            }
            if(f.right != null){
                q.add(f.right);
            }
        }


    }
        ans = reverse(ans);
        return ans;
    }
    static List<List<Integer>> reverse(List<List<Integer>> ans){
       List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
       int j = ans.size() - 1;
       while(j>=0){
       ans1.add(ans.get(j));
       j--;}
       return ans1;
    }
    static List<List<Integer>> lvlorder(Node head){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(head == null){
            return ans;
        }
        List<Integer> curr = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        q.addLast(head);
        Node node1 = new Node(-2);
        q.addLast(node1);
        while(!q.isEmpty()){
            Node f = q.peekFirst();
            q.removeFirst();
            if(f.data==node1.data){
                ans.add(curr);

                curr = new ArrayList<>();
                if(!q.isEmpty()) {
                    q.add(node1);
                }
            }
            else{
             curr.add(f.data);
             if(f.left != null){
                 q.add(f.left);
             }
             if(f.right != null){
                 q.add(f.right);
             }
            }
        }
        return ans;
    }
    static int findheight(Node head){
        if(head == null){
            return 0;
        }
        return 1 + Math.max(findheight(head.left),findheight(head.right));
    }
//    static int mindepth(Node head1){
//        if(head1 == null){
//            return 0;
//        }
//        return
//    }
    static int countnodes(Node head){
        if(head == null){
             return 0;
        }
        return 1 + countnodes(head.left) + countnodes(head.right);
    }
    static boolean symmetric(Node right ,Node left){
        if(right == null && left == null){
             return true;
        }
        if(right != null && left == null){
            return false;
        }
        if(right == null && left != null){
            return false;
        }
        if(right.data != left.data){
            return false;
        }
        return symmetric(right.left,left.right) && symmetric(right.right,left.left);

    }

    static boolean symmetrictree(Node head){
        if(head == null){
            return true;
        }
        return symmetric(head.left,head.right);
    }
    static boolean sametree(Node tree1,Node tree2){
        if(tree1 == null && tree2 == null){
            return true;
        }
        if(tree1 == null && tree2!=null){
            return false;
        }
        if(tree1!=null && tree2==null){
            return true;
        }
        if(tree1.data == tree2.data && sametree(tree1.left,tree2.left) && sametree(tree1.right,tree2.right) ){
            return true;
        }
        return false;
    }
    static void inordertrav(Node root, ArrayList<Integer> ans){

        if(root == null){
            return;

        }
        inordertrav(root.left,ans);
        ans.add(root.data);
        inordertrav(root.right,ans);
    }
    static ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;

        }
        inordertrav(root,ans);
        return ans;
    }
    static void preordertrav(Node root, ArrayList<Integer> ans){

        if(root == null){
            return;

        }
        // preorder traversal
        ans.add(root.data);
        preordertrav(root.left,ans);
        preordertrav(root.right,ans);

// post order traversal
//        preordertrav(root.left,ans);
//        preordertrav(root.right,ans);
//        ans.add(root.data);
    }
    static ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;

        }
        preordertrav(root,ans);
        return ans;
    }
}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}