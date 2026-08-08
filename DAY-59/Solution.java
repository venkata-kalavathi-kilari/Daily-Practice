/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node curNode=head;
        Node prevNode=null;
        while(curNode !=null){
            prevNode=curNode.prev;
            curNode.prev=curNode.next;
            curNode.next=prevNode;
            curNode=curNode.prev;
        }
        head=prevNode.prev;
        return head;
        
    }
}
