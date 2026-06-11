class Solution {
    public String toggleCase(String s) {
     String result= "";
     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(Character.isUpperCase(ch)){
             result+=Character.toLowerCase(ch);
         }else{
             result+=Character.toUpperCase(ch);
         }
        }
     return result;
    }
}
