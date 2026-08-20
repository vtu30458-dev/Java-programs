import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            int[] left = new int[26];
            int[] right = new int[26];
            int mid = n / 2;
            for (int i = 0; i < mid; i++) {
                left[s.charAt(i) - 'a']++;
            }
            int start = (n % 2 == 0) ? mid : mid + 1;
            for (int i = start; i < n; i++) {
                right[s.charAt(i) - 'a']++;
            }
            if (Arrays.equals(left, right)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
Output:
6
gaga
abcde
rotor
xyzxy
abbaab
ababc
YES
NO
YES
YES
NO
NO

