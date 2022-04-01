package com.company;

public class No <E>{
    E data;
    No<E> next;

    public No(E object){ data = object; this.next = null;
    }

    public E getData(){
        return data;
    }
}