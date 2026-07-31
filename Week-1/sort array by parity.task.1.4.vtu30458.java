class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        // Add even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }

        // Add odd numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }
}

Input:
nums =
[3,1,2,4]
Output
[2,4,3,1]
Expected
[2,4,3,1]
