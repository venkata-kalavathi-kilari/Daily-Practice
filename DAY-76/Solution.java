/* Structure of a linked list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/
class Solution {

    public Node deleteAllOccurances(Node head, int x) {
        // code here
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            if(curr.data==x){
                if(prev==null){
                    head=curr.next;
                }else{
                    prev.next=curr.next;
                }
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
