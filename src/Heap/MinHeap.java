package Heap;

import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
        heap.add(null);
    }

    public void insert(int value) {
        heap.add(value);

        int current = heap.size() - 1;

        while (current > 1) {
            int parent = current / 2;

            if (heap.get(parent) <= heap.get(current)) {
                break;
            }

            swap(parent, current);
            current = parent;
        }
    }

    public int remove() {
        if (heap.size() <= 1) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap.get(1);

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int current = 1;

        while (true) {
            int left = current * 2;
            int right = current * 2 + 1;
            int smallest = current;

            if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }

            if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }

            if (smallest == current) {
                break;
            }

            swap(current, smallest);
            current = smallest;
        }

        return min;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}