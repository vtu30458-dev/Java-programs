import java.util.*;
public class Solution {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int windowSum = 0;
        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }
        if (windowSum == d) {
            count++;
        }
        for (int i = m; i < s.size(); i++) {
            windowSum += s.get(i);
            windowSum -= s.get(i - m);
            if (windowSum == d) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(birthday(s, d, m));
        sc.close();
    }
}
Output:
5
1 2 1 3 2
3 2
2
