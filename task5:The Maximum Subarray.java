class Result {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int current = arr.get(0);
        int maxSubarray = arr.get(0);
        int maxSubsequence = arr.get(0);

        boolean hasPositive = arr.get(0) > 0;

        for (int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);

            current = Math.max(value, current + value);
            maxSubarray = Math.max(maxSubarray, current);

            if (value > 0) {
                maxSubsequence += value;
                hasPositive = true;
            }
        }

        if (!hasPositive) {
            maxSubsequence = arr.get(0);

            for (int value : arr) {
                maxSubsequence = Math.max(maxSubsequence, value);
            }
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}
