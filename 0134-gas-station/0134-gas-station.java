class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int total_gas=0;
       int total_cost=0;  // refer nikil lohia
       for(int i =0; i<gas.length;i++){
        total_gas+=gas[i];
        total_cost+=cost[i];
       }
       if(total_cost>total_gas) return -1;
        int gas_tank =0;
        int st_ind =0;
        for(int i =0; i<gas.length;i++){
            gas_tank+=gas[i]-cost[i];
            if(gas_tank<0){
                gas_tank=0;
                st_ind = i+1;
            }
        }
        return st_ind;

    }
}