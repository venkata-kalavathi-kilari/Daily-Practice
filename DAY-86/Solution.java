/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node curr=head;
        Node t;
        while(curr!=null){
            for(int i=1;i<m && curr!=null;i++){
                curr=curr.next;
            }
            if(curr==null){
                return;
            }
            t=curr.next;
            for(int i=1;i<=n && t!=null;i++){
                t=t.next;
            }
            curr.next=t;
            curr=t;
        }
    }
}
