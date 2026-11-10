class Solution {
    public String sortString(String s) {
        // code here
        char[] charArray=s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
