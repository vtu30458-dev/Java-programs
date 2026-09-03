class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
Output:
Case:1
s = "abcde"
goal = "cdeab"
true
Case:2
s = "abcde"
goal = "abced"
false
