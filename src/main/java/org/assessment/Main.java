package org.assessment;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        for (int i = 5; i >= 1; i--) {
            linkedList.pushNode(i);
            linkedList.printNode();
            linkedList.printMiddle();
            linkedList.middleSingle();
        }
    }
}