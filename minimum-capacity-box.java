class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int diff =0;
        int min1 = Integer.MAX_VALUE;
        int j=-1;
        for(int i = 0; i < capacity.length; i++){
        if(capacity[i] == itemSize){
            return i;
        }
        diff = capacity[i]- itemSize;
        if(diff>0){
            min1 = Math.min(diff,min1);        }
        }
                for(int i = 0; i < capacity.length; i++){
                    if(min1 + itemSize == capacity[i]){
                        return i;
                    }
                }
        if(j >=0){
            return j;
        }
        return -1;
    }
}
