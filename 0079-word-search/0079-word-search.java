class Solution {
    public boolean exist(char[][] arr, String word) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i =0 ; i< n;i++){
            for(int j =0; j<m;j++){
                if(dfs(arr,word,i,j,0)) return true;
            }
        }
        return false;
    }
    static boolean dfs(char[][] arr ,String word, int i , int j , int ind){
        if(ind==word.length()) return true;
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length||arr[i][j]=='#'||arr[i][j]!=word.charAt(ind)) return false;

        char temp = arr[i][j];
        arr[i][j]='#';
        boolean found = dfs(arr,word , i-1,j,ind+1)||
                        dfs(arr,word , i+1,j,ind+1)||
                        dfs(arr,word , i,j-1,ind+1)||
                        dfs(arr,word , i,j+1,ind+1);
        arr[i][j]=temp;
        return found;
    }
}