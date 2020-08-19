class Solution {
    int coins=0, max=0;
    public int arrangeCoins(int n) {
        ArrayList<Integer> coins_array = new ArrayList<>();
        while(n>0){
            coins++;
            while(n-coins<0){
                coins--;   
            }
            coins_array.add(coins);
            n-= coins;
        }
        for(int i=0;i<coins_array.size();i++){
            max = Math.max(max, coins_array.get(i));
        }
        return max;
    }
}
