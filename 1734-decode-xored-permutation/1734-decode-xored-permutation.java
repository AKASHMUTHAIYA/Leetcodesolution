class Solution 
{
    public int[] decode(int[] arr) 
    {
       int n=arr.length;
       int []res =new int[n+1];
       int x=1;
       for(int i=2;i<=n+1;i++)
       {
          x=x^i;
       }
       for(int i=1;i<=n;i+=2)
       {
         x=arr[i]^x;
       } 
       res[0]=x;
       for(int i=1;i<=n;i++)
       {
        res[i]=res[i-1]^arr[i-1];
       }
     return res;
    }
}