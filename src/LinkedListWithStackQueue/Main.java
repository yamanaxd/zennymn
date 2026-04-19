package LinkedListWithStackQueue;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== LinkedListWithStackQueue.MyLinkedList のテスト ==========");
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        System.out.println(list);

        System.out.println("先頭を取り出し (期待値 20): " + list.removeFirst());
        System.out.println("先頭を取り出し (期待値 10): " + list.removeFirst());
        System.out.println("先頭を取り出し (期待値 30): " + list.removeFirst());

        try {
            System.out.print("空のリストから取り出し: ");
            list.removeFirst();
        } catch (IllegalStateException e) {
            System.out.println("エラー成功 -> " + e.getMessage());
        }

        System.out.println("========== LinkedListWithStackQueue.MyStack (LIFO) のテスト ==========");
        MyStack stack = new MyStack();

        System.out.println("Push: 1"); stack.push(1);
        System.out.println("Push: 2"); stack.push(2);
        System.out.println("Push: 3"); stack.push(3);
        System.out.println(stack);
        System.out.println("Pop (期待値 3): " + stack.pop());
        System.out.println("Pop (期待値 2): " + stack.pop());
        System.out.println("Pop (期待値 1): " + stack.pop());


        System.out.println("========== LinkedListWithStackQueue.MyQueue (FIFO) のテスト ==========");
        MyQueue queue = new MyQueue();

        System.out.println("Enqueue: 100"); queue.enqueue(100);
        System.out.println("Enqueue: 200"); queue.enqueue(200);
        System.out.println("Enqueue: 300"); queue.enqueue(300);
        System.out.println(queue);
        System.out.println("Dequeue (期待値 100): " + queue.dequeue());
        System.out.println("Dequeue (期待値 200): " + queue.dequeue());
        System.out.println("Dequeue (期待値 300): " + queue.dequeue());
    }
}