class Result {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> temp = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            for (int j = left; j <= right; j++)
                temp.add(matrix.get(top).get(j));

            for (int i = top + 1; i <= bottom; i++)
                temp.add(matrix.get(i).get(right));

            for (int j = right - 1; j >= left; j--)
                temp.add(matrix.get(bottom).get(j));

            for (int i = bottom - 1; i > top; i--)
                temp.add(matrix.get(i).get(left));

            int len = temp.size();
            int shift = r % len;
            int index = 0;

            for (int j = left; j <= right; j++)
                matrix.get(top).set(j, temp.get((shift + index++) % len));

            for (int i = top + 1; i <= bottom; i++)
                matrix.get(i).set(right, temp.get((shift + index++) % len));

            for (int j = right - 1; j >= left; j--)
                matrix.get(bottom).set(j, temp.get((shift + index++) % len));

            for (int i = bottom - 1; i > top; i--)
                matrix.get(i).set(left, temp.get((shift + index++) % len));
        }
    }
}
