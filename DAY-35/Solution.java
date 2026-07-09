class Solution {
    public static boolean checkPangram(String s) {
         for(char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            for(int i = 0; i < s.length(); i++) {
                if(ch == Character.toLowerCase(s.charAt(i))) {
                    found = true;
                    break;
                }
            }
            if(found == false)
                return false;
        }
        return true;
    }
}
