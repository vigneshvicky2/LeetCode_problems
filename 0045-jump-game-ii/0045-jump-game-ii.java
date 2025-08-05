class Solution {
    public int jump(int[] nums) {
        int jump=0,far =0 , cur =0;
        for(int i =0; i<nums.length-1;i++){
            far = Math.max(far,nums[i]+i);
            if(cur==i){
                jump++;
                cur = far;
            }
        }
        return jump;
    }
}