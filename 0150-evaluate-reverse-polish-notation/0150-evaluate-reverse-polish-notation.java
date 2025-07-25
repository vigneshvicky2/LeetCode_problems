class Solution {
    public int evalRPN(String[] tokens) {
         Stack<String> st = new Stack<>();
        int ans =0;
        for(int i =0; i<tokens.length;i++){
            String ch = tokens[i];
            if(Character.isDigit(ch.charAt(0))) {
                st.push(ch);
            }
            else if(ch.charAt(0)=='-' && ch.length()>1 && Character.isDigit(ch.charAt(1))) st.push(ch); 
            else{
                int temp_ans=0;
                int temp2 = Integer.parseInt(String.valueOf(st.pop()));
                int temp1 = Integer.parseInt(String.valueOf(st.pop()));
                switch (ch) {
                    case "+": temp_ans=temp1+temp2;break;
                    case "-": temp_ans=temp1-temp2;break;
                    case "*": temp_ans=temp1*temp2;break;
                    case "/": temp_ans=temp1/temp2;break;
                    case "%": temp_ans=temp1%temp2;break;
                }
                st.push(String.valueOf(temp_ans));
            }
        }
        // System.out.println();
        return Integer.parseInt(st.peek());
    }
}