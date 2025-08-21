//TODO: You are given an array prices where prices[i] is the price of a given stock on the ith day.
//TODO: You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//TODO: Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

import java.util.Scanner;

class Main {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0 ; i < prices.length ; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        System.out.print("Enter the number of days: ");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the price of the stock in the day " + (i+1) +":");
            prices[i] = scanner.nextInt();
        }

        int profit = maxProfit(prices);

        System.out.println("The maximum profit you can make is : " + profit);

        scanner.close();
    }
}