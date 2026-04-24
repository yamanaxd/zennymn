package BinarySearchTree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.printInOrder(); // 出力: 20 30 40 50 60 70 80

        System.out.println("40は存在するか？: " + bst.contains(40));
        System.out.println("99は存在するか？: " + bst.contains(99));
    }
}
