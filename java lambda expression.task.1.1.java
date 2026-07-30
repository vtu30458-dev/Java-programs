import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int choice = sc.nextInt();
            int n = sc.nextInt();

            if (choice == 1) {   // Odd or Even
                if (n % 2 == 0)
                    System.out.println("EVEN");
                else
                    System.out.println("ODD");
            }

            else if (choice == 2) {   // Prime or Composite
                boolean prime = true;

                if (n < 2)
                    prime = false;
                else {
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                }

                if (prime)
                    System.out.println("PRIME");
                else
                    System.out.println("COMPOSITE");
            }

            else if (choice == 3) {   // Palindrome
                int temp = n, rev = 0;

                while (temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp = temp / 10;
                }

                if (rev == n)
                    System.out.println("PALINDROME");
                else
                    System.out.println("NOT PALINDROME");
            }
        }

        sc.close();
    }
}

Output:
EVEN
PRIME
PALINDROME
ODD
COMPOSITE