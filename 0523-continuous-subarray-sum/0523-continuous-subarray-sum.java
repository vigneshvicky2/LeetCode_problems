class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> pre_sum = new HashMap<>();
        pre_sum.put(0,-1);
        int sum =0;
        for(int i =0; i<nums.length;i++){
            sum+=nums[i];
            int rem = sum%k;
            if(pre_sum.containsKey(rem)){
                if(i-pre_sum.get(rem) >=2){
                    return true;
                }
                continue;
            }
            // System.out.println(pre_sum);
            pre_sum.put(rem,i);
        }
        return false;
    }
}