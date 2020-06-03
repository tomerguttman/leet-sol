class Solution {
    public boolean isPowerOfTwo(int n)
    {
        boolean flag = true;
        int amountOfOnesInN = 0;

        if ( n <= 0 )
            return !flag;

        while( n > 0 && flag)
        {
            if( (n & 1) == 1)
            {
                amountOfOnesInN += 1;
                if (amountOfOnesInN > 1)
                    flag = false;
            }

            n = n >> 1;
        }

        return flag;
    }
}
