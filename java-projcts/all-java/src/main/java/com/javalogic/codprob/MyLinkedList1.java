package com.javalogic.codprob;

public class MyLinkedList1 {
    public static void main(String[] args)
    {
        MyLinkedList1 list = new MyLinkedList1();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next
                = new Node(7);
        list.head.next.next.next.next.next.next.next
                = new Node(8);

        System.out.println("Given linked list ");
        list.printList(head);
        Node res = list.reverseUtil(head, null);
        System.out.println("\nReversed linked list ");
        list.printList(res);
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    Node reverseUtil(Node curr, Node prev)
    {
        /*If head is initially null OR list is empty*/
        if (head == null)
            return head;
        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;
            /* Update next to prev node */
            curr.next = prev;
            return head;
        }
        /* Save curr->next node for recursive call */
        Node next1 = curr.next;
        /* and update next ..*/
        curr.next = prev;
        reverseUtil(next1, curr);
        return head;
    }

    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
