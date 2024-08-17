class Solution
{
    public boolean isPowerOfTwo(int n) 
    {
       long m=n;
       if(n==0)
       {
        return false;
       }
       return ((m & m-1)==0);
    }
}