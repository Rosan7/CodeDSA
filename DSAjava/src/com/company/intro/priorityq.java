package com.company.intro;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class priorityq {


    List<Integer> pq = new ArrayList<>();

    priorityq() {


    }

    boolean isEmpty() {
        return pq.size() == 0;
    }

    // it will return the size of out priority queue
    int getSize() {
        return pq.size();

    }

    int getMin() {
        if (pq.size() >= 1)
            return pq.get(0);
        return 0;
    }

    void insert(int element) {
        pq.add(element);// CBT yes and heap not satisfied
        int cI = pq.size() - 1;
        while(cI>0) {
            int pI = (cI - 1) / 2;
            if (pq.get(cI) < pq.get(pI)) {
                Collections.swap(pq, cI, pI);
                cI = pI;
            }
            else{
                break;
            }
        }

    }
    int removemin(){
        if(isEmpty()){
            return 0;// pq is empty
        }
        int ans = pq.get(0);
        Collections.swap(pq,0,pq.size()-1);
        pq.remove(pq.size()-1);
        // CBt yes and heap no
        // down heapify
        int pI = 0;
        while(true){
            int lci = 2 * pI + 1;
            int rci = 2 * pI + 2;
            int mini = pI;
            if (lci < pq.size() && pq.get(lci) < pq.get(mini)){
                mini = lci;
            }
            if (rci < pq.size() && pq.get(rci) < pq.get(mini)){
                mini = rci;
            }
            if(mini == pI){
                break;
            }
            Collections.swap(pq,pI,mini);
            pI = mini;
        }
        return ans;


    }
//    void inplaceheapsort(ArrayList<Integer> pq , int n){
//        // Build the heap in input array
//        for(int i=1;i<n;i++){
//            int cI = i;
//            while(cI>0) {
//                int pI = (cI - 1) / 2;
//                if (pq.get(cI) < pq.get(pI)) {
//                    Collections.swap(pq, cI, pI);
//                    cI = pI;
//                }
//                else{
//                    break;
//                }
//            }
//        }
//        // heap is ready
//        // Remove min n times
//        int size = n;
//        while(size >= 1){
//        Collections.swap(pq,0,pq.size()-1);
//        size--;
//        // Down heapify
//        int pI = 0;
//
//        while(true){
//            int lci = 2 * pI + 1;
//            int rci = 2 * pI + 2;
//            int mini = pI;
//            if (lci < size && pq.get(lci) < pq.get(mini)){
//                mini = lci;
//            }
//            if (rci < size && pq.get(rci) < pq.get(mini)){
//                mini = rci;
//            }
//            if(mini == pI){
//                break;
//            }
//            Collections.swap(pq,pI,mini);
//            pI = mini;
//        }
//    }
//    }
    void inplaceheapsort(ArrayList<Integer> pq,int n){
        for(int i=1;i<n;i++){
            int cI = i;
            while(cI>0){
                int pI = (cI - 1)/2;
                if(pq.get(pI) > pq.get(cI)){
                    Collections.swap(pq,pI,cI);
                    cI = pI;
                }
                else{
                    break;
                }
            }
        }
        // Remove min n times
        int size = n;
        while(size>=1 ){
            Collections.swap(pq,0,pq.size()-1);
            size -- ;
            int pI = 0;
            while(true){
                int rI = 2 * pI + 1;
                int lI = 2 * pI + 2;
                int mI = pI;
                if(lI < size && pq.get(mI) > pq.get(lI)){
                    mI = lI;
                }
                if( rI < size && pq.get(mI) > pq.get(rI)){
                    mI = rI;
                }
                if(mI == pI){
                    break;
                }
                Collections.swap(pq,pI,mI);
                pI = mI;
            }
        }
    }
    static void ksortarray(int[] pq,int size,int k){
         PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
        for(int i=0;i<=k;i++){
            PQ.add(pq[i]);
        };
        int s = 0;
        for(int i=k+1;i<size;i++){
            pq[s] = PQ.peek();
            PQ.poll();
            s++;
            PQ.add(pq[i]);
        }
        while(!PQ.isEmpty()){
            pq[s] = PQ.peek();
            s++;
            PQ.poll();
        }
        System.out.println(Arrays.toString(pq));

    }

    static void ksmallest(int[] ans,int size,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(o1 < o2){
                   return 1;
               }
               else if(o1.equals(o2)){
                   return 0;
               }
               else{
                   return -1;
               }
            }
        });
        for(int i=0;i<k;i++){
            pq.add(ans[i]);
        }
        for(int i=k;i<size;i++){
            if (pq.peek() > ans[i]){
                pq.poll();
                pq.add(ans[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.peek());
            pq.poll();
        }

    }
    public static void main(String[] args) {
        int[] array = {2,6,3,12,56,8};
        priorityq.ksmallest(array,6,3);

    }
}

