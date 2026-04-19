package LinkedListWithStackQueue;

public class MyQueue {
    private MyLinkedList list = new MyLinkedList();

    public void enqueue(int data) {
        list.addLast(data);
    }

    public int dequeue() {
        return list.removeFirst();
    }
    @Override
    public String toString() {
        return "Queue状態: " + list.toString();
    }
}
