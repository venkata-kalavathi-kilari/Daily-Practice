/* Structure of circular linked list node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public void printList(Node head) {
        // code here
        if(head ==null){
            return; 
        }
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        while(curr!=head);
    }
}
