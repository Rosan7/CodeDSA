package com.company.intro;

public class beautifularrangement {
    static int count = 0;
    public static void main(String[] args) {
        int N = 2;
        int[] arr = new int[N];
        for(int i=1;i<=N;i++){
            arr[i-1] = i;
        }
        arrangements(arr,0);
        System.out.println(count);
    }
    static void arrangements(int[] arr,int start){
        if(start==arr.length){
            count+=1;
        }
        for(int i=start;i<arr.length;i++){
            swap(arr,i,start);
            if(arr[start] % (start+1) ==0 || (start+1) % arr[start] ==0){
                arrangements(arr,start+1);
            }
            swap(arr,i,start);
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
