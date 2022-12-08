class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int k = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                k += accounts[i][j];
            }
            max = Math.max(k, max);
        }

        return max;
    }
}
