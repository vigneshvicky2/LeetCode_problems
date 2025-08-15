class Solution {
    public String convert(String s, int n) {
        if(n==1) return s;
        ArrayList<ArrayList<Character>> ans = new ArrayList<>(); // my approach
        for(int i =0; i< n ;i++ ) ans.add(new ArrayList<Character>());
        int ind =0;
        int flag =1;
        for(char ch : s.toCharArray()){
            ans.get(ind).add(ch);
            if(ind==n-1) flag=-1;
            else if (ind==0) flag =1;
            ind+=flag;
        }
        String fin_ans ="";
        for(int i =0; i< n;i++){
            for(int j =0; j< ans.get(i).size() ;j++){
                fin_ans+=ans.get(i).get(j);
            }
        }
        // System.out.println(fin_ans);
        return fin_ans;
    }
}