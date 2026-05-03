package Heap;

import java.util.PriorityQueue;

public class StandardLibraryHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(1);
        pq.add(5);

        System.out.println(pq.poll()); // 1（最小値）
    }
}
