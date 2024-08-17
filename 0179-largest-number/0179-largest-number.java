class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0)
        {
            return "";
        }
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(str,(a,b)-> (b+a).compareTo(a+b));
        StringBuilder result=new StringBuilder();
        if(str[0].equals("0"))
        {
            return "0";
        }
        for(int i=0;i<str.length;i++)
        {
            result.append(str[i]);
        }
        return result.toString();
    }
}