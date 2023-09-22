package org.example.exercises.week4;

import java.util.function.Consumer;

public class LinkedList {

    Node head;

    public void add(String value) {
        //Create new node
        Node temp = new Node();
        temp.data = value;
        //Add to end of list
        Node nextNode = head;

        while (nextNode != null) {
            if (nextNode.next == null) {
                nextNode.next = temp;
                return;
            }
            nextNode = nextNode.next;
        }
        //First add needs this, because head is null
        head = temp;
    }

    public void remove(String value) {
        //Check all nodes and remove if node.data.equals(value)
        Node nextNode = head;
        Node previousNode = null;

        while (nextNode != null) {
            if (nextNode.data.equals(value)) {
                //First node, head needs to change
                if (nextNode == head)
                    head = nextNode.next;
                //Other nodes, previous.next needs to change
                else
                    previousNode.next = nextNode.next;
            }
            previousNode = nextNode;
            nextNode = nextNode.next;
        }
    }

    public void forEach(Consumer<String> action) {
        Node nextNode = head;

        while (nextNode != null) {
            action.accept(nextNode.data);
            nextNode = nextNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.forEach(System.out::println);
        System.out.println();
        linkedList.remove("B");
        linkedList.forEach(System.out::println);
        System.out.println();
        linkedList.remove("C");
        linkedList.forEach(System.out::println);
        System.out.println();
        linkedList.remove("A");
        linkedList.forEach(System.out::println);

    }
}

class Node {
    public String data;
    public Node next;
}
