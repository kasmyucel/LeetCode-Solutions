class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCaseCount=0;
        int lowerCaseCount=0;
        for(int i =0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i)))
               lowerCaseCount++;
            else if(Character.isUpperCase(word.charAt(i)))
                upperCaseCount++;

        }
        if(lowerCaseCount==0 && upperCaseCount >0)
           return true;
        else if(upperCaseCount==0 && lowerCaseCount>0)
            return true;
        else if(('A'<= word.charAt(0) && word.charAt(0)<='Z')&& lowerCaseCount>0 && upperCaseCount==1)
            return true;
        else 
          return false;
    }
}