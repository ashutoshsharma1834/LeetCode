class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
        int c = 0;
        Arrays.sort(arr);
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i])
                c++;
        }
        return c;
    }
}
