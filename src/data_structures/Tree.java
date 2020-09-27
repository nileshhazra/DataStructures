package data_structures;

public class Tree {
    private static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if(root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if(value< current.value){
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;}
            else {
                if(current.rightChild ==null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current !=null) {
            if(value> current.value)
                current = current.rightChild;
            else if(value< current.value)
                current = current.leftChild;
            else
                return true;
        }
        return false;
    }
    public void traversePreOrder() {
        traversePreOrder(root);
    }
    public void traverseInOrder() {
        traverseInOrder(root);
    }
    public void traversePostOrder() {
        traversePostOrder(root);
    }
    private void traversePreOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.value+ " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    private void traverseInOrder(Node root) {
        if(root == null){
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.rightChild);
    }
    private void traversePostOrder(Node root) {
        if(root == null){
            return;
        }
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value +" ");
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
//    Tree Structure
//          7
//        /   \
//       4     9
//      / \   / \
//     1   6 8  10
        System.out.println(tree.find(14)); //return false
        System.out.println("Pre-Order : ");
        tree.traversePreOrder();
        System.out.println("\nIn-Order: ");
        tree.traverseInOrder();
        System.out.println("\nPost-Order: ");
        tree.traversePostOrder();
    }
}
