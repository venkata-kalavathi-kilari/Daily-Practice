import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        int ans=0;
        while(low<=high){
          int mid=(low+high)/2;
          if(arr[mid]<arr[mid+1]){
            low=mid+1;
          }else{
          high=mid-1;
          }
        }
        System.out.println(low);
    }
}
