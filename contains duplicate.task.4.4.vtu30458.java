import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
Output:
Example 1
Input:  [1,2,3,1]
Output: true
Example 2
Input:  [1,2,3,4]
Output: false
Example 3
Input:  [1,1,1,3,3,4,3,2,4,2]
Output: true