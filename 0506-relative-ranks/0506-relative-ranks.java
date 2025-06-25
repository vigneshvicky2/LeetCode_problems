class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer,Integer>> ans = new PriorityQueue<>((p1,p2) -> (p2.getValue()-p1.getValue()));
        for(int i =0; i< score.length;i++){
            ans.add(new Pair(i,score[i]));
        }
            System.out.println(ans);

        String[] fin = new String[score.length];
        int place =1;
        while(!ans.isEmpty()){
            Pair <Integer ,Integer> temp = ans.poll();
            int ind = temp.getKey();
            if(place==1){
                fin[ind] = "Gold Medal";
            }
            else if(place==2){
                fin[ind] = "Silver Medal";
            }
            else if(place==3){
                fin[ind] ="Bronze Medal";
            }
            else{
                fin[ind]= String.valueOf(place);
            }
            place++;
        }
        
        // for(int num : score){
        //     ans.add(num);
        // }
        // System.out.println(ans);
        return fin;
    }
}