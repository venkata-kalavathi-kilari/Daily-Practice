/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    static int countNode(Node node){
        int count=1;
        Node temp=node;
        while(temp.next!=node){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head,fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
                if(slow ==fast) return countNode(slow);
        }
        return 0;
    }
}
