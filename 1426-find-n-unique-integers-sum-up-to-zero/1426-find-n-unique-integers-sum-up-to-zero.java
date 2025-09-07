class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int left =0;
        int right =n-1;
        int temp=1;
        while(left<=right){
            if(left!=right){
            arr[left]=temp;
            arr[right]=-temp;
            left++;
            right--;
            temp++;
            }
            else{
                arr[left]=0;
                left++;
            }

        }
        return arr;
    }
}