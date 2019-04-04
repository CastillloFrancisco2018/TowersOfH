package com.example.franciscocastillo.towersofhanoiapp;

public class Stack {
    private Node top;
    public int count;

    public Stack(){
        this.count = count;
        this.top = top;
    }

    public int getCount() {
        return count;
    }

    public void push(int payload){      //make new Node (n) that stores given payload
        Node n = new Node(payload);     //set its pointer = to the top(first) Node
        n.setNextNode(this.top);        //set the new top = to (n)
        this.top = n;
        this.count++;

    }

    public int pop(){
        Node nodeToReturn = this.top;
        this.top = this.top.getNextNode();
        nodeToReturn.setNextNode(null);
        this.count--;
        return nodeToReturn.getPayload();
    }

    public int peek(){
        return this.top.getPayload();
    }

    public void display(){
        if (this.top == null){
            System.out.println("*****Empty");
        }
        else{
            Node curNode = this.top;
            do{
                System.out.println("******"+ curNode.getPayload());
                curNode = curNode.getNextNode();
            }
            while(curNode != null);
        }
    }
}
