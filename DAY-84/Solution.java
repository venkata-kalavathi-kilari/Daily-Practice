/* Structure of a node in linked list
class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
*/

class Solution {
    static Node linkMatrix(int arr[][]) {
        // code here
        int m=arr.length;
        int n=arr[0].length;
        Node mainHead=null;
        ArrayList<Node> head=new ArrayList<>(m); 
        Node rightcurr=null;
        for(int i=0;i<m;i++){
            head.add(null);
            for(int j=0;j<n;j++){
                Node newPtr=new Node(arr[i][j]);
                if(mainHead==null){
                    mainHead=newPtr;
                }
                if(head.get(i)==null){
                    head.set(i,newPtr);
                }else{
                    rightcurr.right=newPtr;
                }
                rightcurr=newPtr;
            }
        }
        for(int i=0;i<m-1;i++){
            Node curr1=head.get(i);
            Node curr2=head.get(i+1);
            
            while(curr1 !=null && curr2!=null){
                curr1.down=curr2;
                curr1=curr1.right;
                curr2=curr2.right;
            }
        }
        return mainHead;
    }
}
