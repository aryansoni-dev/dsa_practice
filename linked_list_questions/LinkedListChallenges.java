package dsa_practice.linked_list_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Challenge Link - https://www.hackerrank.com/contests/testlinkedlist/challenges

public class LinkedListChallenges {
    // 1 - Print the elements of a linked list.
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }
    // 2 - Insert a node at the tail of a linked list.
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        if (head == null) {
            head = n;
        } else {
            SinglyLinkedListNode t = new SinglyLinkedListNode(data);
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
    
        return head;
    }
    // 3 - Insert a node at the head of a linked list.
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    
        return head;
    }
    // 4 - Insert a node at a specific position in a linked list.
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        
        if (position == 0) {
            n.next = head;
            return n;
        }

        SinglyLinkedListNode t = head;
        for (int i = 0; i < position - 1; i++) {
            t = t.next;
        }
        n.next = t.next;
        t.next = n;

        return head;
    }
    // 5 - Delete a node at a specific position in a linked list.
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (head == null) return head;
        if (position == 0) return head.next;

        SinglyLinkedListNode t = head;
        for (int i = 0; i < position - 1; i++) {
            t = t.next;
        }
        if (t.next != null) t.next = t.next.next;
        return head;
    }
    // 6 - Print the elements of a linked list in reverse order.
    public static void reversePrint(SinglyLinkedListNode head) {
        List<Integer> l = new ArrayList<>();
        SinglyLinkedListNode t = head;
        while (t != null) {
            l.add(t.data);
            t = t.next;
        }
        Collections.reverse(l);
        for (int i : l) {
            System.out.println(i);
        }
    }
    // 7 - Reverse a linked list.
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        List<Integer> l = new ArrayList<>();
        SinglyLinkedListNode t = head;
        while (t != null) {
            l.add(t.data);
            t = t.next;
        }
        Collections.reverse(l);
        t = head;
        int i = 0;
        while (t != null && i < l.size()) {
            t.data = l.get(i);
            t = t.next;
            i++;
        }
        return head;
    }
    // 8 - Compare two linked lists.
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode t1 = head1, t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.data != t2.data) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1 == null && t2 == null;
    }
    // 9 - Merge two sorted linked lists.
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) tail.next = head1;
        if (head2 != null) tail.next = head2;
        return dummy.next;
    }
    // 10 - Get the value of a node at a specific position from the tail of a linked list.
    public static int getNode(SinglyLinkedListNode head, int posFromTail) {
        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode slow = head;
        
        for (int i = 0; i < posFromTail; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
