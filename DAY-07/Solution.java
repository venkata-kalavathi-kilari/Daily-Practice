class Main {
    static void updateArray(int[] arr) {
        int n = arr.length;
        int prev = 1;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int next;
            if(i==n-1){
                next=1;
            }else{
                next=arr[i+1];
            }
            arr[i] = prev * curr * next;
            prev = curr;
        }
    }
