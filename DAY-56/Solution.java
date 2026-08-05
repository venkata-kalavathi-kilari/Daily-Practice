/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */


class Solution {
    static int getLength(Node head){
        int length=0;
        while(head !=null){
            length++;
            head=head.next;
        }
        return length;
    }
    int getMiddle(Node head) {
        // code here
        int length=getLength(head);
        int mid=length/2;
        while(mid>0){
            head=head.next;
            mid--;
        }
        return head.data;
    }
}
