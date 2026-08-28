import java.util.*;
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}
Output:
Case:1
Words=["mass","as","hero","superhero"]
["as","hero"]
Case:2
Words=["leetcode","et","code"]
["et","code"]
Case:3
Words:["blue","green","bu"]
[]

