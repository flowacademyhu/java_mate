package com.flow.lecture.dynamicPit;

public class DynamicPit {
    private class Node {
        int value;
        Node prev;

        public Node(int value, Node prev) {
            this.value = value;
            this.prev = prev;
        }
    }
    private Node tail = null;
    private Node actual = null;
    private int size;

    public boolean isEmpty() {
        return tail == null;
    }

    public void push(int newValue) {
        actual = new Node(newValue, tail);
        tail = actual;
        actual = tail;
        size++;
    }

    public int pop() {
        int value;
        if (!isEmpty()) {
            value = tail.value;
            tail = tail.prev;
            actual = tail;
            size--;
            return value;
        }
        return 0;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder temp = new StringBuilder();
            temp.append("[");
            while (actual.prev != null) {
                temp.append(actual.value).append(", ");
                actual = actual.prev;
            }
            temp.append(actual.value).append("]");
            actual = tail;
            return temp.toString();
        }
        return "";
    }

    public int getSize() {
        return size;
    }
}
