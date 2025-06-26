class Solution {
    public int longestSubsequence(String s, int k) {
       int z_cnt =0;
       for(int i =0; i< s.length() ;i++){
        if(s.charAt(i)=='0') z_cnt++;
       } 
       int ans =0;
       int ind = s.length()-1;
       int temp_ans=0;
       boolean flag = false;
       int cnt=0;
       for(int i =ind ; i>=0;i--){
        if(!flag) {
            // System.out.println("hi " +i);
            if(s.charAt(i)=='1')ans+=Math.pow(2,cnt);
            else z_cnt--;
            cnt+=1;
              }
            if(ans>k && !flag){
                // System.out.println("hi " +i+" "+ans);
                cnt--; 
                flag = true;
            }
       }
       return cnt+z_cnt;
    }
    
}