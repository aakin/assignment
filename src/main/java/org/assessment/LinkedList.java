package org.assessment;

public class LinkedList {

    Node head;

    // Creating a new Node
    class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // Function to add a new Node
    public void pushNode(int data)
    {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Displaying the elements in the list
    public void printNode()
    {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null" + "\n");
    }

    // A utility function to print a given linked list
    static void printList(Node ptr)
    {

        while (ptr != null)
        {
            System.out.print(ptr.data +
                    "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    // Finding the length of the list.
    public int getLen()
    {

        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    // Printing the middle element of the list.
    public void printMiddle()
    {

        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is [" + temp.data + "]");
            System.out.print("\n\n");
        }
    }

    // Returning the middle element of the list.
    public int getMiddle()
    {

        int middle = 0;
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            middle = temp.data;
        }

        return middle;
    }

    //Deletes the middle element of the list.
    public void deleteMiddleNode() {

        Node slow, fast, prev;

        slow = fast = prev = head;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
    }

    //Another method to get the middle element
    public int middleSingle() {

        Node current , middle;
        int length = 0;
        current = middle = head;

        while(current.next != null){
            length++;
            if(length%2 ==0){
                middle = middle.next;
            }
            current = current.next;
        }

        if(length%2 == 1){
            middle = middle.next;
        }

        return middle.data;
    }
}
