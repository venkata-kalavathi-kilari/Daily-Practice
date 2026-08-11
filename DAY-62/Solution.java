class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution{
    static Node deleteLastOccurrence(Node head, int key) {
        Node last = null, lastPrev = null;
        Node curr = head, prev = null;
        while (curr != null) {
            if (curr.data == key) {
                lastPrev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (last != null) {

            if (lastPrev != null) {
                lastPrev.next = last.next;
            } else {

                head = head.next;
            }
        }

        return head;
    }
