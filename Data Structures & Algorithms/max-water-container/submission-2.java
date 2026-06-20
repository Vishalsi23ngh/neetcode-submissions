class Solution {
    public int maxArea(int[] heights) {
        
        /* 
        this is two pointer question 
        firt take left and right pointer
        move from left to right , if left < right than move left to the next pointer 
        if right < left than move the pointer to next positin 
        */

        int l = 0;
        int r = heights.length - 1;
        int a = 0;

        while(l < r){
            a = Math.max(a, (r - l) * Math.min(heights[l], heights[r]));
            if(heights[l] < heights[r]) l++;
            else r--;
        }

        return a;
    }
}
