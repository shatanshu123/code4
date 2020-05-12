class Solution {
  public int findJudge(int N, int[][] trust) {
        int[] trustArr = new int[N+1];
        for (int[] temp: trust) {
            trustArr[temp[0]]--;
            trustArr[temp[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (trustArr[i] == N - 1) return i;
        }
        return -1;
    }
}
