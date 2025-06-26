class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> br = new Stack<>();  // my apporoach
        Stack<Integer> sr = new Stack<>();
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') br.push(i);
            else if(ch=='*') sr.push(i);
            else if( ch==')'){
                if(!br.isEmpty()) br.pop();
                else if(!sr.isEmpty()) sr.pop();
                else return false;
            }
        }
        while(!sr.isEmpty() && !br.isEmpty()){
            int open_ind = br.pop();
            int close_ind = sr.pop();
            if(open_ind>close_ind) return false;
        }
        return br.isEmpty();
    }
}
// (((((()*)(*)*))())())(()())())))((**)))))(()())()