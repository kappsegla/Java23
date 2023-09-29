package org.example.exercises.week5;

public class BinaryTree {

    Node root;

    public void add(int value) {
        Node node = new Node();
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
                    }  else currentNode = currentNode.right;
                } else {
                    // currentNode.value == value
                    break;
            }
        }
    }
    //


}

    public void printNumbersSorted() {
        //sout
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
    }

}

class Node {
    int value;
    Node left;
    Node right;
}
