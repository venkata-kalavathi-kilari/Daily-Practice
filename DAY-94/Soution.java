// Write your solution here
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++){
          price[i]=sc.nextInt();
        }
        int lowPrice=price[0];
        int maxProfit=0;

        for(int i=0;i<price.length;i++){
          if(price[i]<lowPrice){
             lowPrice=price[i];
          }else{
            int profit=price[i]-lowPrice;
            if(profit>maxProfit)
                maxProfit=profit;
          }
        }    
        System.out.println(maxProfit);
    }
}
