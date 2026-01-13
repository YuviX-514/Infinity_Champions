package Infinity_Champions;

public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[]arr = {7, 1, 5, 3, 6, 4};
        int ans1 = brute(arr);
        int ans2 = opt(arr);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int brute(int[]prices){
        int n = prices.length;
        int p  = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                p = Math.max(p, prices[j] - prices[i]);
            }
        }
        return p;
    }

    static int opt(int[]prices){
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int p : prices){
            int pr = p - min;
            min = Math.min(min, p);
            max = Math.max(max, pr);
        }
        return max;
    }
}
