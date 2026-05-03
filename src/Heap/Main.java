package Heap;

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        System.out.println(heap.remove()); // 1
        System.out.println(heap.remove()); // 3
        System.out.println(heap.remove()); // 5
        System.out.println(heap.remove()); // 8

        heap.insert(10);
        heap.insert(2);

        System.out.println(heap.remove()); // 2
    }
}