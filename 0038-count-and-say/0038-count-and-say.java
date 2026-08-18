class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int k = 1; k<n;k++){
            String ans = "";
            for(int i = 0; i< s.length(); i++){
                int count = 1;
                int j = i+1;
                while (j < s.length() && s.charAt(j) == s.charAt(i)){
                    count++;
                    j++;
                } 
                ans += count;
                ans += s.charAt(i);
                i = j - 1;
            }
            s = ans;
        }
        return s;
    }
}