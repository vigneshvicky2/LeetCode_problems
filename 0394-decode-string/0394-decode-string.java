class Solution {
    public String decodeString(String s) {
       Stack<Integer> num_st = new Stack<>();
       Stack<String> str_st = new Stack<>();
       StringBuilder str = new StringBuilder();
       int num =0;
       for(char c : s.toCharArray()){
        if(c>='0' && c<='9') num = (num*10) + c-'0';
        else if(c=='['){
            num_st.push(num);
            num =0;
            str_st.push(str.toString());
            str= new StringBuilder();
        }
        else if(c==']'){
            StringBuilder temp = new StringBuilder(str_st.pop());
            temp.append(str.toString().repeat(num_st.pop()));
            str = temp;

        }
        else str.append(c);
       }
        return str.toString();
    }

}