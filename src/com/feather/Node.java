package com.feather;

public class Node {

    private int _data;
    private Node _next;

    public Node(){}
    public Node(Node next){
        this._next=next;
    }
    public Node(int data){
        this._data=data;
    }
    public Node getNext(){
        return this._next;
    }
    public void setNext(Node node){
        this._next=node;
    }
    public int getData(){
        return this._data;
    }

}