class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int x : stones ){
            if(x % 3 == 0)
            a++;
            else if(x % 3 == 1)
            b++;
            else 
            c++;
        }
        if(b == 0 && c == 0)
        return false;
        if(a % 2 == 0)
        return b > 0 && c > 0;
        if(b > c)
        return b - c > 2;
        else
        return c - b > 2;
    }
}