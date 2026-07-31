import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int temp=n, rev=0;

        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }

        if(temp==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

OUTPUT:
Enter number: 1
Palindrome
