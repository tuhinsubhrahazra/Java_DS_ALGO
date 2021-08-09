package com.company.Heap;

public class DecreaseKey_Delete_Build_heap {

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

        public void decreaseKey(int key , int data){
            arr[key] = data;
            for (int i=key; i!=0 && arr[Parent(i)] > arr[i];){
                int temp = arr[Parent(i)];
                arr[Parent(i)] = arr[i];
                arr[i] = temp;
                i = Parent(i);
            }
        }

        public void deleteKey(int key){
            arr[key] = arr[size-1];
            size--;
            minHeapify(key);
        }

        public void BuildHeap(){
             for (int i = Parent(size-1); i>=0;i--){
                 minHeapify(i);
             }
        }
    }

    public static void main(String[] args) {
        minHeap heap = new minHeap(6);
//        heap.Insert(10);
//        heap.Insert(20);
//        heap.Insert(40);
//        heap.Insert(80);
//        heap.Insert(100);
//        heap.Insert(90);

        heap.arr[0] = 3;
        heap.arr[1] = 6;
        heap.arr[2] = 2;
        heap.arr[3] = 9;
        heap.arr[4] = 5;
        heap.arr[5] = 7;
        heap.size = 6;

        heap.print();
        heap.BuildHeap();

//        heap.print();
//        heap.decreaseKey(3,5);
//        heap.deleteKey(3);
        heap.print();
    }
}
