package medium;

public class coinChange {
    public static void main(String[] args) {
        coinChange n=new coinChange();
        n.coinChange(new int[]{2,4},5);
//        [186,419,83,408]
//        6249
    }
    public int coinChange(int[] coins, int amount) {
        int[] d=new int[amount+1];
        for (int i = 0; i <= amount; i++) {
            d[i]=Integer.MAX_VALUE-2;
        }
        d[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i) {
                    d[i] = Math.min(d[i - coins[j]] + 1, d[i]);
                }
            }
        }
        if (d[amount]==Integer.MAX_VALUE-2) return -1;
        return d[amount];
    }
}
