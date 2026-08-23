/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int[] count={0,0,0};
        Node ptr=head;
        while(ptr!=null){
            count[ptr.data]+=1;
            ptr=ptr.next;
        }
        ptr=head;
        int n=0;
        while(ptr!=null){
            if(count[n]==0){
                n+=1;
            }else{
               ptr.data=n;
               count[n]-=1; 
               ptr=ptr.next; 
            }
        }
        return head;
    }
}
