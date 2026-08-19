class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        int index = 0;
        while(index < word1.length || index < word2.length){
        if(index < word1.length){
            s1 = s1 + word1[index];
        }
        if(index < word2.length){
            s2 = s2 + word2[index];
        }
        index++;
        }
        return s1.equals(s2);
    }
}