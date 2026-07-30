class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}

Example 1
Input:

nums = [1,2,3,4]

Output:

[1,3,6,10]
Example 2

Input:

nums = [1,1,1,1,1]

Output:

[1,2,3,4,5]
Example 3

Input:

nums = [3,1,2,10,1]

Output:

[3,4,6,16,17]