class Solution {
    public int maxProfit(int[] prices) {
        int max_profit =0;
        int left =0;
        for(int i =1; i<prices.length; i++){
            if(prices[i] > prices[left]){
                int profit = prices[i] - prices[left];
                max_profit = Math.max(max_profit, profit);
            }
            else{
                left =i;
            }
        }
        return max_profit;
        
    }
}
