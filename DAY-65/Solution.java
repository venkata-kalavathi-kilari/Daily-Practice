/* Structure of linked list Node
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
    public static void printLis(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            if(curr!=null){
                System.out.println("->");
            }
            curr=curr.next;
        }
        System.out.println();
    }
    public ArrayList<Node> mergeList(Node head1, Node head2) {
        // code here
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null && curr2!=null){
            Node ptr1=curr1.next;
            Node ptr2=curr2.next;
            curr2.next=curr1.next;
            curr1.next=curr2;
            curr1=ptr1;
            curr2=ptr2;
        }
        ArrayList<Node>result=new ArrayList<Node>();
        result.add(head1);
        result.add(curr2);
        return result;
    }
}
