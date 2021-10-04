package org.opendesk.tree;

public class BinarySearchTree {
    private Node root = null;
    private int nodeCount = 0;

    boolean isEmpty (){
        return nodeCount == 0;
    }

    public boolean addNode (int value){
        if (contains (value)) return false;

        root = add (root, value);
        nodeCount++;
        return true;
    }

    private Node add(Node node, int value) {
        if (node == null){
            node = new Node (null, null, value);
        }else{
            if (node.data > value){
                node.leftNode = add (node.leftNode, value);
            }else{
                node.rightNode = add (node.rightNode, value);
            }
        }

        return node;
    }

    public boolean contains(int value) {
        return contains (root, value);
    }

    private boolean contains(Node node, int value) {
        if (node == null) return false;

        if (node.data > value){
            return contains (node.leftNode, value);
        }else{
            return contains (node.rightNode, value);
        }
    }

    private class Node {
        private Node leftNode;
        private Node rightNode;
        private int data;

        Node (Node leftNode, Node rightNode, int data){
            this.leftNode = leftNode;
            this.rightNode = rightNode;
            this.data = data;
        }
    }
}


