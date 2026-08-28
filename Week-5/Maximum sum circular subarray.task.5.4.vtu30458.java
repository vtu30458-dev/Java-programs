class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currentMax = 0, maxSum = nums[0];
        int currentMin = 0, minSum = nums[0];
        for (int num : nums) {
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
            totalSum += num;
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}
Output:
Example:1
[1,-2,3,-2]
3
Example:2
[5,-3,5]
10
Example:3
[-3,-2,-3]
-2
