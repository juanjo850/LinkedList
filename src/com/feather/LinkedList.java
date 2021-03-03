package com.feather;

public class LinkedList {

    private Node _head;
    private int _size;

    public void insert(int data){

        Node node= new Node(data);

        _size=_size+1;

        if(_head==null){
            _head=node;
            return;
        }

        Node aux=_head;
        while(aux.getNext()!=null){
            aux=aux.getNext();
        }
        aux.setNext(node);
    }
    public void push(int data){
        Node node= new Node(data),
            aux=_head;

        node.setNext(aux);
        _head=node;
        _size=_size+1;
    }
    public void remove(int data){

        if(_head==null) return; //defensive programing
        Node aux=_head;

        if(aux.getData()==data){
            if(aux.getNext()!=null) {
                _head = null;
                return;
            }
            _head=aux.getNext();
            return;
        }

        Node next= aux.getNext();

        while(next!=null){
            if(next.getData()==data){
                aux.setNext(next.getNext());
                _size=_size-1;
                return;
            }

            aux=aux.getNext();
            next=aux.getNext();
        }

    }
    public int removeAll(int data){

        if(_head==null) return 0; //defensive programing

        Node aux=_head;
        int del=0;

        while(aux.getData()==data){
            _head=aux.getNext();
            aux=_head;
            del=+1;
        }

        Node next= aux.getNext();

        while(next!=null){
            if(next.getData()==data){
                aux.setNext(next.getNext());
                del=+1;
            }
            else aux=aux.getNext();
            if(aux!=null) next=aux.getNext();
        }
        _size=-del;
        return del;
    }
    public boolean find(int data){
        if(_head==null) return false; //defensive programing

        Node aux=_head;
        while(aux!=null){
            if(aux.getData()==data) return true;

            aux=aux.getNext();
        }
        return false;
    }

}
