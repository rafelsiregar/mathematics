class Solution {
    public int arrangeCoins(int n) {
        int coins=0, max=0;
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
    
    public int[] plusOne(int[] digits) {
        // traverse the array from the less to the most significant digit (right to left).
        boolean done = false;
        for (int i = digits.length - 1; i > -1; i--) {
            // if the current digit == 9 put zero at that position.
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            // if the current digit != 9 increment by one and break;
            else {
                digits[i] += 1;
                done = true;
                break;
            }
        }
        
        if (done) {
            return digits;
        }
		
        // in case digits was full of nines (e.g. 9, or 99)
        // return a new array with digits.length + 1 with a leading one (e.g. 100).
		else {
            int[] output = new int[digits.length + 1];
            output[0] = 1;
            return output;
        }
    }
}
