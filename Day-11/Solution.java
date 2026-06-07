import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
         int sum = 0;
        
        // iterating over all the numbers 
        // between 1 to n
        for (int i= 1; i <= n; i++) 
        {
            sum = sum + i;
        }
        System.out.println(sum);
        
    }
}
