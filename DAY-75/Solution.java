/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Integer> s=new Stack<>();
        Node curr=head;
        while(curr!=null){
            s.add(curr.data);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            int val=s.pop();
            if(curr.data!=val){
                return false;
            }
            curr=curr.next;
        }
        return true;
    }
}
