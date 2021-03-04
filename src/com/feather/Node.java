package com.feather;

public class Node<E>{

    private E _data;
    private Node<E> _next;

    public Node(){}
    public Node(Node<E> next){
        this._next=next;
    }
    public Node(E data){
        this._data=data;
    }
    public Node<E> getNext(){
        return this._next;
    }
    public void setNext(Node<E> node){
        this._next=node;
    }
    public E getData(){
        return this._data;
    }

}