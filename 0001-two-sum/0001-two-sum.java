class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len =nums.length;
        int[] result=new int[2];
        int num=0;
        int sum=0;

        for(int i=0;i<len;i++)
        {
            num=nums[i];

            for(int j=i+1;j<len;j++)
            {
                sum=num+nums[j];
                if(sum==target)
                {
                  result[0]=i;
                  result[1]=j;
                }
            }
        }
        return result;
    }
}