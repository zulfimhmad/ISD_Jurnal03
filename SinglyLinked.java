package com.company;

import java.util.NoSuchElementException;

public class SinglyLinked<E> {
    private No<E> firstNo;
    private No<E> lastNo;
    private String name;

    public SinglyLinked() {
        this("linked list");
    }

    public SinglyLinked(String listName) {
        name = listName;
        firstNo = lastNo = null;
    }
    // Insert At Front
    public void insertAtFront(E insertItem) {
        No newNo = new No(insertItem);

        if (isEmpty()) {
            firstNo = lastNo = new No<E>(insertItem);
        } else { // firstNo refers to new No
            newNo.next = firstNo;
            firstNo = newNo;
        }
    }
    // Insert At Back
    public void insertAtBack(E insertItem) {
        No newNo = new No(insertItem);

        if (isEmpty()) {
            firstNo = lastNo = new No<E>(insertItem);
        } else {
            lastNo.next = newNo;
            lastNo = newNo;
        }
    }
    //Remove from Back
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNo.data;

        if (firstNo == null) {
            firstNo = lastNo = null;
        } else {
            No<E> current = firstNo;
            while (current.next != lastNo) {
                current = current.next;
            }
            lastNo = current;
            current.next = null;
        }
        return removedItem;
    }
    //Remove from Front
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = firstNo.data;

        if(firstNo != null){
            No temp = new No(firstNo);
            firstNo = firstNo.next;
            temp = null;
        }
        return removedItem;
    }

    private boolean isEmpty() {
        return firstNo == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: %n", name);
        No<E> current = firstNo;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
    }
}