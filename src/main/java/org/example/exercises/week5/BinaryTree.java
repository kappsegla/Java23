package org.example.exercises.week5;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (current.value > value) {
            current.left = addRecursive(current.left, value);
        } else if (current.value < value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);

       /* Node node = new Node();
        node.value = value;

        if (root == null) {
            root = node;
        } else {
            Node currentNode = root;

            while (true) {
                if (currentNode.value > value) {
                    if (currentNode.left == null) {
                        currentNode.left = node;
                        break;
                    } else currentNode = currentNode.left;
                } else if (currentNode.value < value) {
                    if (currentNode.right == null) {
                        currentNode.right = node;
                        break;
                    } else currentNode = currentNode.right;
                } else {
                    // currentNode.value == value
                    break;
                }
            }
        }*/
    }

    public void printNumbersSorted() {
        printNode(root);
    }

    private void printNode(Node node) {
        if (node == null)
            return;
        printNode(node.left);
        System.out.println(node.value);
        printNode(node.right);
    }

    public static void main(String[] args) {
        var btree = new BinaryTree();
        btree.add(6);
        btree.add(4);
        btree.add(4);
        btree.add(5);
        btree.add(3);
        btree.add(8);
        btree.add(7);
        btree.add(9);

        btree.printNumbersSorted();
    }

}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
