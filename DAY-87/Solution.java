/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        HashSet<Node> st=new HashSet<>();
        Node prev=null;
        while(head!=null){
            if(!st.contains(head)){
                st.add(head);
                prev=head;
                head=head.next;
            }else{
                prev.next=null;
                break;
            }
        }
    }
}
