package com.feather;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void insert1element() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        //act
        l.insert(n);
        //assert
        assertTrue(l.find(n));
    }

    @org.junit.jupiter.api.Test
    void insert2element() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0, n2=1;
        //act
        l.insert(n);
        l.insert(n2);
        //assert
        assertTrue(l.find(n2));
    }

    @org.junit.jupiter.api.Test
    void push() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        //act
        l.push(n);
        //assert
        assertTrue(l.find(n));
    }

    @org.junit.jupiter.api.Test
    void pushGenerics() {
        //arrange
        LinkedList<String> l=new LinkedList<String>();
        String s="Hello";
        //act
        l.push(s);
        //assert
        assertTrue(l.find(s));
    }

    @org.junit.jupiter.api.Test
    void removeHeadRemoved() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        l.insert(n);
        l.insert(2);
        l.insert(3);
        //act
        l.remove(n);
        //assert
        assertFalse(l.find(n));
    }
    @org.junit.jupiter.api.Test
    void removeHeadKept() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        l.insert(2);
        l.insert(n);
        l.insert(3);
        //act
        l.remove(n);
        //assert
        assertFalse(l.find(n));
    }


    @org.junit.jupiter.api.Test
    void removeAllHeadRemoved() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        l.insert(n);
        l.insert(n);
        l.insert(n);
        l.insert(2);
        //act
        l.removeAll(n);
        //assert
        assertFalse(l.find(n));
    }
    @org.junit.jupiter.api.Test
    void removeAllHeadKept() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        l.insert(2);
        l.insert(n);
        l.insert(n);
        l.insert(n);
        //act
        l.removeAll(n);
        //assert
        assertFalse(l.find(n));
    }

    @org.junit.jupiter.api.Test
    void find() {
        //arrange
        LinkedList l=new LinkedList();
        int n=0;
        l.insert(n);
        //act
        //assert
        assertTrue(l.find(n));
    }

    @org.junit.jupiter.api.Test
    void findGeneric() {
        //arrange
        LinkedList<LinkedList<Character>> l=new LinkedList<LinkedList<Character>> ();
        LinkedList<Character> l2=new LinkedList<Character>();
        Character c='a';
        l2.insert(c);
        l.insert(l2);
        //act
        //assert
        assertTrue(l2.find(c));
        assertTrue(l.find(l2));
    }
}