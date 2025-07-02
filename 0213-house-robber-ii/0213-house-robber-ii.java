class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] arr1 = new int[nums.length-1];
        int[] arr2 = new int[nums.length-1];
        int ind =0;
        for(int i =0; i<nums.length-1;i++){
            arr1[ind]=nums[i];
            arr2[ind]=nums[i+1];
            ind++;
        }
        int max_loot_arr1 = robing(arr1);
        int max_loot_arr2 = robing(arr2);
        return Math.max(max_loot_arr1 ,max_loot_arr2);
    }
    static int robing(int[] arr){
        if(arr.length<2) return arr[0];
        int[] dp = new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i =2;i<arr.length;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        return dp[arr.length-1];
    }
}