/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    static Node reverse(Node head){
         Node prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
      head1=reverse(head1);
      head2=reverse(head2);
      Node sum=null;
      int carry=0;
      while(head1!=null || head2!=null || carry>0){
          int newValue=carry;
          if(head1!=null){
              newValue+=head1.data;
              head1=head1.next;
          }
          if(head2!=null){
              newValue+=head2.data;
              head2=head2.next;
          }
          carry=newValue/10;
          newValue%=10;
          
          Node newNode=new Node(newValue);
          newNode.next=sum;
          sum=newNode;
      }
      while(sum!=null && sum.data==0){
          sum=sum.next;
      }
       return (sum==null)?new Node(0):sum;
    }
}
