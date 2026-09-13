// Write your solution here
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res=nums[0];
        int maxEnd=nums[0];
        for(int i=1;i<n;i++){
           maxEnd=Math.max(maxEnd+nums[i],nums[i]);
           res=Math.max(res,maxEnd);
        }
        System.out.println(res);
    }
}
