package com.example.franciscocastillo.towersofhanoiapp;

public class Node {
    private int payload;
    private Node nextNode;

    public Node(int listNum){
        this.payload = listNum;
        this.nextNode = null;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getPayload() {
        return payload;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
