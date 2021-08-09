package com.company.Heap;

public class Insert_in_Heap {

    public static class minHeap {
        int size;
        int[] arr;
        int capacity;

        public minHeap(int c){
            capacity = c;
            arr = new int[capacity];
            size =0;
        }

        int left(int i){
            return 2*i + 1;
        }
        int right(int i){
            return 2*i +2;
        }
        int Parent(int i){
            return (i-1)/2;
        }

        public void print(){
            for (int i =0; i<size; i++){
                System.out.println(arr[i]);
            }
        }

        public void Insert(int data){
            if (size == capacity){
                return;
            }
            size++;
            arr[size -1] = data;
            for (int i = size-1; i!=0 && arr[i] < arr[Parent(i)];){
                int t = arr[Parent(i)];
                arr[Parent(i)] = arr[i];
                arr[i] = t;
                i = Parent(i);
            }
        }
    }

    public static void main(String[] args) {
        minHeap heap = new minHeap(4);
        heap.Insert(7);
        heap.Insert(3);
        heap.Insert(12);
        heap.Insert(15);
        heap.Insert(6);

        heap.print();
    }


}
