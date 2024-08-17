class Solution {
    public String reverseWords(String s) {
        String []sentence=s.trim().split("\\s+");
        String result="";
        for(int i=sentence.length-1;i>0;i--)
        {
            result=result+sentence[i]+" ";
        }
        return result+sentence[0];
    }
}