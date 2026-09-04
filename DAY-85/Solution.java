/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseBetween(int a, int b, Node head) {
        // code here
        Node curr=head,prev=null;
        int i;
        for(i=1;i<a;i++){
            prev=curr;
            curr=curr.next;
        }
        Node revHead=curr;
        Node revTail=null;
        Node next;
        while(i<=b){
            next=curr.next;
            curr.next=revTail;
            revTail=curr;
            curr=next;
            i++;
        }
        if(prev!=null){
            prev.next=revTail;
        }else{
            head=revTail;
        }
        revHead.next=curr;
        
        return head;
    }
}
