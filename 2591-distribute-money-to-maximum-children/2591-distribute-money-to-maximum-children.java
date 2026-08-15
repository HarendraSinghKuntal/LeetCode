class Solution {
    public int distMoney(int money, int children) {
        if(money < children){
            return -1;
        }
        money = money - children;
        int count = money / 7;
        if(count > children){
            count = children;
        }
        money = money - count * 7;
        children = children - count;
        if(children == 0 && money > 0){
            count--;
        }
        if(children == 1 && money == 3){
            count--;
        }
        return count;
    }
}