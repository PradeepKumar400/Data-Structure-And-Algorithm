class BuyAndSellStock {
    public static void main(String args[]) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int potentialprofit = prices[i] - minPrice;
            if (potentialprofit > maxProfit) {
                maxProfit = potentialprofit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        System.out.println("Max Profit = " + maxProfit);

    }
}