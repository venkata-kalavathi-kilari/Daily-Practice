/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count=0;
        Node curr=head;
        while(curr !=null){
            count++;
            curr=curr.next;
        }
        if(k>count){
            return -1;
        }
        curr=head;
        for(int i=0;i<count-k;i++){
            curr=curr.next;
        }
        return curr.data;
    }
}
