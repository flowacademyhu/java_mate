package com.flow.lecture;

public class LinkdList {

    private class Node {
        int value;
        Node prev = null;
        Node next = null;

        public Node(int listInt, Node prev, Node next) {
            this.value = listInt;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;
    private Node actual = null;
    private int size;

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFirst() {
        return actual == head;
    }

    public boolean isLast() {
        return actual == tail;
    }

    public int getActualValue() {
        if (actual != null) {
            return actual.value;
        }
        return 0;
    }

    public void setActualValue(int newValue) {
        if (actual != null) {
            actual.value = newValue;
        }
    }

    public void stepBackward() {
        if (actual != null && !isFirst()) {
            actual = actual.prev;
        }
    }

    public void stepForward() {
        if (actual != null && !isLast()) {
            actual = actual.next;
        }
    }

    public void stepLast() {
        actual = tail;
    }

    public void stepFirst() {
        actual = head;
    }

    public void insertFirst(int newValue) {
        actual = new Node(newValue, null, head);
        if (isEmpty()) {
            head = tail = actual;
        } else {
            head.prev = actual;
            head = actual;
        }
    }

    public void insertLast(int newValue) {
        if (isEmpty()) {
            insertFirst(newValue);
        } else {
            actual = new Node(newValue, tail, null);
            tail.next = actual;
            tail = actual;
        }
    }

    public void insertBefore(int newValue) {
        if (isEmpty() || isFirst()) {
            insertFirst(newValue);
        } else {
            Node newNode = new Node(newValue, actual.prev, actual);
            actual.prev.next = newNode;
            actual.prev = newNode;
            actual = newNode;
        }
    }

    public void insertAfter(int newValue) {
        if (isEmpty() || isLast()) {
            insertLast(newValue);
        } else {
            stepBackward();
            insertBefore(newValue);
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (isFirst()) {
                actual = head.next;
                head = head.next;
                head.prev = null;
            }
            if (head != null) {
                head = head.next;
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (tail == head) {
                removeFirst();
            }
            if (isLast()) {
                actual = tail.prev;
                tail = tail.prev;
                tail.next = null;
            }
            if (tail != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    public void removeActual() {
        if (!isEmpty()) {
            if (isFirst()) {
                removeFirst();
                return;
            }
            if (isLast()) {
                removeLast();
                return;
            }
            actual.prev.next = actual.next;
            actual.next.prev = actual.prev;
            actual = actual.next;
        }
    }

    public boolean contains(int searchValue) {
        if (!isEmpty()) {
            actual = head;
            do {
                if (actual.value == searchValue) {
                    return true;
                }
                actual = actual.next;
            } while (!isLast());

        }
        return false;
    }

    public String toString() {
        if (!isEmpty()) {
            StringBuilder temp = new StringBuilder();
            temp.append("[");
            actual = head;
            while (!isLast()) {
                temp.append(actual.value).append(", ");
                actual = actual.next;
            }
            temp.append(actual.value).append("]");
            return temp.toString();

        }
        return "";
    }

    public int getSize() {
        if (!isEmpty()) {
            actual = head;
            do {
                size++;
                actual = actual.next;
            } while (!isLast());
            return size;
        }
        return 0;
    }
}