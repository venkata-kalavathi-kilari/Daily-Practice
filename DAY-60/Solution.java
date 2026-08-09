/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(k==0 || head==null) return head;
        Node curr=head;
        int length=1;
        while(curr.next!=null){
            curr=curr.next;
            length+=1;
        }
        k%=length;
        if(k==0){
            return head;
        }
        curr.next=head;
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        head=curr.next;
            curr.next=null;
            return head;
        
    }
}
