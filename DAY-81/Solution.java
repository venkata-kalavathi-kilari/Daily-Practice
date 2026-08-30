/*
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
    public Node swapKth(Node head, int k) {
        // code here
        if(head==null) return head;
        int count=0;
        Node temp1=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        if(k>count) return head;
        
        if(2*k-1 ==count) return head;
        
        Node FromBeginPrev=null;
        Node curr1=head;
        for(int i=1;i<k;i++){
            FromBeginPrev=curr1;
            curr1=curr1.next;
        }
        
        Node FromEndPrev=null;
        Node curr2=head;
        for(int i=1;i<count-k+1;i++){
            FromEndPrev=curr2;
            curr2=curr2.next;
        }
        
        if(FromBeginPrev !=null) FromBeginPrev.next=curr2;
        if(FromEndPrev!=null) FromEndPrev.next=curr1;
        
        Node temp2=curr1.next;
        curr1.next=curr2.next;
        curr2.next=temp2.next;
        
        
        if (k == 1) head = curr2;
        if (k == count) head = curr1;
        
        return head;
    }
}
