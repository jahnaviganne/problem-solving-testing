class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                count++;
        }

        for (int i = mid; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                count--;
        }

        return count == 0;
    }
}
