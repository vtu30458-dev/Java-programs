import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            salaries.add(sc.nextInt());
        }

    alaries.forEach(salary -> {
            int updatedSalary = salary + (salary * 10 / 100);
            System.out.print(updatedSalary + " ");
        });

        sc.close();
    }
}

Output:
3
20000
564564
1234568
22000 621020 1358024