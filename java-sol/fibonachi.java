class Solution {
    public int fib(int N)
    {
       if (N <= 1)
       {
         return N;
       }

       return fib(N-1) + fib(N-2);
    }

    /*
    class Solution {
    public int fib(int N) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(goldenRatio, N)/ Math.sqrt(5));
    }
    */

    /*
    public int fib(int N)
    {
        int first, second,temp;
        if (N == 0)
            return 0;
        else if (N == 1)
            return 1;
        first = 0;
        second = 1;
        for(int i = 2; i<= N; i++)
        {
            temp = second;
            second = first + second;
            first = temp;
        }

        return second;
    }
    */
}
