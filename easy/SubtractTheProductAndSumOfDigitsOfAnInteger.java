class SubtractTheProductAndSumOfDigitsOfAnIntege {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mult = 1;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c - '0';
            sum += num;
            mult *= num;
        }

        return mult - sum;
    }
}
