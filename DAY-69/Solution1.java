/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        if(head==null) return null;
        Node curr=head;
        while(curr !=null && curr.next !=null){
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;
            
            curr=curr.next.next;
            
        }
        return head;

    }
    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next!=null){
                System.out.println("->");
                
            }
            temp=temp.next;
            
        }
        System.out.println();
    }
}
