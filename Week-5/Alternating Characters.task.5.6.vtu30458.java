import java.io.*;

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < q; i++) {
            String s = bufferedReader.readLine().trim();
            System.out.println(Result.alternatingCharacters(s));
        }

        bufferedReader.close();
    }
}
Output:
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
3
4
0
0
4
