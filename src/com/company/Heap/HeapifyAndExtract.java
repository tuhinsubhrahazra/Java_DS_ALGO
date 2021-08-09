package com.company.Heap;

public class HeapifyAndExtract {

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
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
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

//        public void minHeapify(int pos){
////            System.out.println("P"+arr[pos]);
////            System.out.println("P1"+arr[left(pos)]);
////            System.out.println("P2"+arr[right(pos)]);
////            System.out.println("Print heapify : " + size);
//            for (int i = pos; i < size-2 ;){
//                if (arr[left(i)]>arr[right(i)]){
//                    int temp = arr[i];
//                    arr[i] = arr[right(i)];
//                    arr[right(i)] = temp;
//                    i = right(i);
//                }
//                else{
//                    int temp = arr[i];
//                    arr[i] = arr[left(i)];
//                    arr[left(i)] = temp;
//                    i = left(i);
//                }
//            }
//
//        }

        public void minHeapify(int i){
            int left = left(i);
            int right = right(i);

            int smallest = i;
            if (left < size && arr[left] < arr[i]){
                smallest = left;
            }
            if (right < size && arr[right] < arr[smallest]){
                smallest = right;
            }

            if (smallest !=i){
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;

                minHeapify(smallest);
            }
        }

        public int extractMin(){
            if (size <= 0){
                return Integer.MAX_VALUE;
            }
            if (size == 1){
                size--;
                return arr[0];
            }
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;
            size--;
            minHeapify(0);
            return arr[size];

        }
    }

    public static void main(String[] args) {
        minHeap heap = new minHeap(4);
        heap.Insert(7);
        heap.Insert(5);
        heap.Insert(3);
        heap.Insert(9);

        heap.print();
        System.out.println(heap.extractMin());
        heap.print();

    }
}
