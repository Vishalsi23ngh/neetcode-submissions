class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<= 1) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        //initially there is no before starting and after ending so putting the left and right 0 
        left[0] = height[0];
        right[n -1] = height[n-1];

        for(int i = 1; i < n; i++){
            left[i] = Math.max(height[i], left[i -1]);
        }

        for( int i = n - 2; i >= 0;i--){
            right[i] = Math.max(height[i], right[i + 1]);
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            int val = Math.min(left[i], right[i]) - height[i];

            result += val;
        }

        return result;
    }
}
