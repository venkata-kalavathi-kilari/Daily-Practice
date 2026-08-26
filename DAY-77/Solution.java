/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code her
        Node curr=head;
        int count=1;
        while(curr.next!=head){
            curr=curr.next;
            count++;
        }
        Node last=curr;
        int mid=(count+1)/2;
        curr=head;
        for(int i=1;i<mid;i++){
            curr=curr.next;
        }
        Node head1=head;
        Node head2=curr.next;
        
        curr.next=head1;
        last.next=head2;
        
        return new Pair<>(head1,head2);
    }
}
