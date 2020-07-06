    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxContainer = 0, min;
        while (left < right )
        {
            min = Math.min(height[left], height[right]);
            maxContainer = Math.max(maxContainer, min * (right - left));
            if ( min == height[left]) { left += 1; }
            else { right -= 1; }
        }

        return maxContainer;
    }