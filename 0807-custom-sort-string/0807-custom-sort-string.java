class Solution {
    public String customSortString(String order, String s) {
         int[] alpha = new int[26];
      for(int i =0; i<s.length(); i++){
        alpha[s.charAt(i)-'a']++;
      }
      String ans ="";
      for(int i =0; i<order.length();i++){
        if(alpha[order.charAt(i)-'a']!=0){
            ans+=String.valueOf(order.charAt(i)).repeat(alpha[order.charAt(i)-'a']);
            alpha[order.charAt(i)-'a']=0;
        }
      }
      for(int i =0; i<alpha.length;i++){
        if(alpha[i]!=0){
            char temp =(char) ((char)i+'a');
            ans+=String.valueOf(temp).repeat(alpha[i]);
        }
      }
      return ans;
    }
}