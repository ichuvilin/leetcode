class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> list = new ArrayList<>(n);
        first:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    list.add(false);
                    continue first;
                }
            }
            list.add(true);
        }
        return list;
    }
}
