/* Node Structure
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} 
*/
class Solution {
    static final int MOD=1000000007;
    static long getNumber(Node head){
        long sum=0;
        while(head!=null){
            sum=(sum*10+head.data)%MOD;
            head=head.next;
        }
        return sum;
    }
    long multiplyTwoLists(Node first, Node second) {
        // Code here
        long num1=getNumber(first);
        long num2=getNumber(second);
        
        return (num1*num2)%MOD;
            
    }
}
