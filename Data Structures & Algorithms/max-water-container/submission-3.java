class Solution {
    public int maxArea(int[] heights) {
       

       int left= 0, right=heights.length-1;
       int maxwater=0;

       while(left<right){
        int ht=Math.min(heights[left],heights[right]);
        int width=right- left;
        int currwater=ht*width;
        maxwater=Math.max(currwater, maxwater);
        if(heights[left]<heights[right]){
            left++;
        }else{
            right--;
        }
       }

        

    return maxwater;
       
    }
}