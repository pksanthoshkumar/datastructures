/*
package org.opendesk.linkedlist;

import lombok.Data;

@Data
public class LinkedList {
    private Node firstNode;
    private Node lastNode;

    private Node addFirst (int value){
        Node newFirstNode = new Node ();
        newFirstNode.setValue(value);

        if (firstNode != null ){
            newFirstNode.setNextNode(firstNode);
        }

        firstNode = newFirstNode;
        return firstNode;
    }
    private Node addLast (int value){
        lastNode = new Node();
        lastNode.setValue(value);

        Node currentNode = firstNode;
        Node previousNode = null;

        while (currentNode != null ){
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        previousNode.setNextNode(lastNode);

        return currentNode;
    }
    // delete First
    // delete last
    // contains
    // index

    public void printLL () {
        Node node = firstNode;
        while (node != null){
            System.out.println(node.getValue());
            node = node.getNextNode();
        }
    }

    public void LinkedList () {}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.addFirst(10);
//        ll.addFirst(20);
        ll.addLast(30);

        ll.printLL();
    }
}
*/
