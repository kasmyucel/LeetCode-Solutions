// This is one of my first year solutions in the Computer Engineering department.
class Solution {
    public static char findTheDifference(String s, String t) {
        int[] charsOfS = new int[26];
        int[] charsOfT = new int[26];
        for(int i=0; i<s.length(); i++)
           charsOfS[s.charAt(i)-97]++;
        for(int i=0; i<t.length(); i++)
           charsOfT[t.charAt(i)-97]++;
        int diffIndex =0;
        for(int i=0; i<26; i++)
           if(charsOfS[i] != charsOfT[i]){
              diffIndex = i;
              break;}
        return (char)(diffIndex+97);
        
    }
}
