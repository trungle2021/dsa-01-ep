package day01;
public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {1,2};
        System.out.println(maxProfit2(prices));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min_price = prices[0];
        int max_profit = 0;
        for (int i = 0; i < n; i++) {
            if(prices[i] < min_price) {
                min_price = prices[i];
            }else if (prices[i] - min_price > max_profit) {
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }

    public static int maxProfit2(int[] prices){
        int n = prices == null ? 0 : prices.length;
        if (n <= 1) return 0;
        int profit= 0, minPrice = prices[0], maxProfit = 0;
        for (int i = 0; i < n; i++){
            profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}

