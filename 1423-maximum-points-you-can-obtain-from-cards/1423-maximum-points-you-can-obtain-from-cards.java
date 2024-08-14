class Solution 
{
    public int maxScore(int[] cardPoints, int k)
    {
        int left_sum=0,right_sum=0,sum=0,max=Integer.MIN_VALUE;
        int i,j=cardPoints.length-1; 
        for(i=0;i<=k-1;i++)
        {
            left_sum = left_sum+cardPoints[i];
        } 
        //left_sum = 14 
        max = left_sum; 
        for(i=k-1 ; i>=0 ; i--)
        { // i =2 
            left_sum = left_sum-cardPoints[i]; //left = 4 
            right_sum = right_sum + cardPoints[j]; //right = 1 
            sum = left_sum+right_sum;  //sum = 9 
            j--;
            if(max < sum)
            {
                max = sum;
            }
            
        } 
        return max;
    }
} 