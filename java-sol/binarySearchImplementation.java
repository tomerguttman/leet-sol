class Solution 
{
    
    int binarySearch(int arr[], int x) 
    { 
        int left = 0, right = arr.length - 1; 
        while (left <= right) 
        { 
            int middle = ((left + right) / 2); 
            if (arr[middle] == x) 
                return middle; 
            if (arr[middle] < x) 
                left = middle + 1; 
            else
                right = middle - 1; 
        } 
        
        return -1; 
    } 
    
    public int[] searchRange(int[] nums, int target) 
    {
        int index = binarySearch(nums, target);
        return index;
    }
}