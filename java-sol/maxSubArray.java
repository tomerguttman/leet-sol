class Solution {
    public int maxSubArray(int[] nums) 
    {
        if(nums.length < 2) { return nums[0]; }
        int [] other = new int [nums.length];
        int max = nums[0];
        other[0] = nums[0];
        
        
        for( int indx = 1; indx < nums.length; indx++)
        {
            if(nums[indx] + other[indx-1] > nums[indx]) { other[indx] = other[indx-1] + nums[indx]; }
            else { other[indx] = nums[indx]; }
            
            if ( max < other[indx] ) { max = other[indx]; }
        }
        
        return max;
    }
}