class Solution {
    public int maxSubarraySumCircular(int[] nums) {
     int currmin = 0, currmax = 0,globmax=nums[0],globmin =nums[0];
     int total = 0;
     for(int n : nums){
        currmax=Math.max(currmax +n,n);
        currmin = Math.min(currmin + n , n);
        total = total +n;
        globmax = Math.max(globmax,currmax);
        globmin = Math.min(globmin,currmin);
     } 
     System.gc();  
     if(globmax > 0){
        return Math.max(globmax, total - globmin);
     }else{
        return globmax;
     }
    }
}
