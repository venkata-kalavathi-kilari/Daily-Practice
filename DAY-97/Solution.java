class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> common=new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        int n3=c.length;
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(a[i]==b[j] && b[j]==c[k]){
                common.add(a[i]);
                i++;
                j++;
                k++;
        
                while(i<n1 && a[i]==a[i-1]){
                    i++;
                }
            
                while(j<n2 && b[j]==b[j-1]){
                    j++;
                }
            
                while(k<n3 && c[k]==c[k-1]){
                    k++;
                }
            }
            else if(a[i]<b[j]){
                i++;
            }else if(b[j]<c[k]){
                j++;
            }else{
                k++;
            }     
        }
        return common;
    }
}
