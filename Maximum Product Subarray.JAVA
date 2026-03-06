class Solution {
    public int maxProduct(int[] nums) {
      int currpro =1;
      int maxpro = Integer.MIN_VALUE;
      int n = nums.length;
      if(n==1){
        int m = nums[n-1];
        return m;
      }
      for(int i = 0; i < n; i++){
        
        if(  i != n -1 && nums[i]<0 && nums[i+1] <0){
            currpro = currpro * nums[i]* nums[i+1];
        }
        currpro = currpro * nums[i];
       
        if(currpro>maxpro){
            maxpro = currpro;
        }
      }
      if(maxpro==1){
        return 0;
      }
      else{
        return maxpro;
      }
    }
}
