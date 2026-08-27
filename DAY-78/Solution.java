/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        Node ptr1=head;
        Node ptr2=head;
        while(ptr2.next!=null){
            ptr2=ptr2.next;
        }
        ArrayList<ArrayList<Integer> > res=new ArrayList<>();
        
        while(ptr1!=ptr2 && ptr2.next!=ptr1){
            if((ptr1.data+ptr2.data)==target){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(ptr1.data);
                pair.add(ptr2.data);
                res.add(pair);
                ptr1=ptr1.next;
                ptr2=ptr2.prev;
                
            }else if((ptr1.data+ptr2.data)>target){
                ptr2=ptr2.prev;
            }else{
                ptr1=ptr1.next;
            }
        }
        return res;
        
    }
}
