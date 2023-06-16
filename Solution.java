class Solution {
  public String longestPalindrome(String s) {
        int lengthofString = s.length()-1;
        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < lengthofString; i++) {
            for(int j = lengthofString; j>i; j--){
                if(j-i+1<=maxLength)
                    break;
                else if(isPalindrom(s, i, j))
                {
                    maxLength = j-i+1;
                    start = i;
                }
            }
        }
        return s.substring(start, start+maxLength);
    }
    private boolean isPalindrom(String text,int left,int right)
    {
        while(left<right)
        {
            if(text.charAt(left)!=text.charAt(right))
               return false;
            left++;
            right--;
        }
        return true;
    }
}