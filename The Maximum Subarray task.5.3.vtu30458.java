import java.io.*;
import java.util.*;
public class Solution {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int current = arr.get(0);
        int maxSubarray = arr.get(0);
        int maxSubsequence = 0;
        int largest = arr.get(0);
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
            if (num > 0) {
                maxSubsequence += num;
            }
        }
        if (maxSubsequence == 0) {
            maxSubsequence = largest;
        }
        for (int i = 1; i < arr.size(); i++) {
            int num = arr.get(i);
            current = Math.max(num, current + num);
            maxSubarray = Math.max(maxSubarray, current);
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxSubarray);
        result.add(maxSubsequence);
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(input[i]));
            }
            List<Integer> result = maxSubarray(arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
    }
}
Output:
1
5
-2 -3 -1 -4 -6
-1 -1
