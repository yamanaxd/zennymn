package BinarySearchTree;

public class BinarySearchTree {

    private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(int data) {
        root = insertHelper(root, data);
    }

    private Node insertHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertHelper(current.left, data);
        } else if (data > current.data) {
            current.right = insertHelper(current.right, data);
        }
        return current;
    }

    public boolean contains(int data) {
        return containsHelper(root, data);
    }

    private boolean containsHelper(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        if (data < current.data) {
            return containsHelper(current.left, data);
        } else {
            return containsHelper(current.right, data);
        }
    }

    public void printInOrder() {
        System.out.print("BSTの中身(小さい順): ");
        printInOrderHelper(root);
        System.out.println();
    }

    private void printInOrderHelper(Node current) {
        if (current != null) {
            printInOrderHelper(current.left);
            System.out.print(current.data + " ");
            printInOrderHelper(current.right);
        }
    }

}
