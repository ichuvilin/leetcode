class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        for (int i = n; i <= 1000; i++) {
            if (i % n == 0 && i % 2 == 0)
                return i;
        }
        return 0;
    }
}
