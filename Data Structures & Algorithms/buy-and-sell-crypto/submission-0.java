class Solution {
    public int maxProfit(int[] prices) {
        int ans = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int key : prices){
            min = Math.min(key, min);
            ans = Math.max(ans , key - min);
        }
        return ans;
    }
}
