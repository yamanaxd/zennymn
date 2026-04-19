package LinkedListWithStackQueue;

public class MyStack {
    private MyLinkedList list = new MyLinkedList();

    public void push(int data) {
        list.addFirst(data);
    }

    public int pop() {
        return list.removeFirst();
    }
    @Override
    public String toString() {
        return "Stack状態: " + list.toString();
    }
}