import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        System.out.print("Enter choice (even/odd): ");
        String ch=sc.next();

        int sum=0;

        while(n>0){
            int digit=n%10;

            if(ch.equalsIgnoreCase("even") && digit%2==0)
                sum+=digit;

            if(ch.equalsIgnoreCase("odd") && digit%2!=0)
                sum+=digit;

            n=n/10;
        }

        System.out.println("Sum = "+sum);
    }
}

Output:
Enter number: 5
Enter choice (even/odd): 2
Sum = 0
