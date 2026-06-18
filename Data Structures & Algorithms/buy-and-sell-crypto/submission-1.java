class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int key : prices){
            min = Math.min(min, key);
            ans = Math.max(ans, key - min);
        }

        return ans;
    }
}
