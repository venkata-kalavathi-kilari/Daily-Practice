/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        
       HashSet<Node> head1Data=new HashSet<>();
       Node curr1=head1;
       while(curr1!=null){
           head1Data.add(curr1);
           curr1=curr1.next;
       }
       Node curr2=head2;
       while(curr2!=null){
           if(head1Data.contains(curr2)){
               return curr2;
           }
           curr2=curr2.next;
       }
       return null;
    }
}
