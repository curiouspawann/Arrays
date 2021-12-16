package com.company;

import java.util.PriorityQueue;

public class KLargestElement {

    private void printKLargestElement(int[] arr, int k, int size){
        PriorityQueue<Integer> minHeap =  new PriorityQueue<>();
        for(int i = 0; i < size; i++) {
            minHeap.add(arr[i]);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }
        while(minHeap.size()>0) {
            System.out.println(minHeap.peek());
            minHeap.poll();
        }
    }


}
