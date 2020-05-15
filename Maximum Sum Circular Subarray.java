class Solution {
     public int maxSubarraySumCircular(int[] A) {
         int maxSoFar = 0;
         int minSoFar = 0;
 
         int sum = 0;
         int minSum = Integer.MAX_VALUE;
         int maxSum = Integer.MIN_VALUE;
 
         for(int a: A) {
             maxSoFar = a + Math.max(maxSoFar, 0);
             maxSum = Math.max(maxSum, maxSoFar);
 
             minSoFar = a + Math.min(minSoFar, 0);
             minSum = Math.min(minSum, minSoFar);
 
             sum += a;
         }
 
         if(sum == minSum) {
             return maxSum;
         }
         return Math.max(maxSum, sum - minSum);
     }
 }
