/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/

class Solution {
    public Node reverseKNodes(Node head,int k){
        Node curr=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        return prev;
    }
    public Node reverseKGroup(Node head, int k) {
        // code here
        
        if(head==null) return head;
        Node temp=head;
        int count=0;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        Node groupHead=reverseKNodes(head,k);
        head.next=reverseKGroup(temp,k);
        return groupHead;
    }
}
