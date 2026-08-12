/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head.next==null || head==null) return null;
        int len=0;
        Node curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int mid=len/2;
        curr=head;
        for(int i=1;i<mid;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
