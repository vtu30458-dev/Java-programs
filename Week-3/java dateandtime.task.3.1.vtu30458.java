import java.io.*;
import java.util.*;
import java.time.*;

public class Solution {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(findDay(month, day, year));

        sc.close();
    }
}

Output:
08 05 2015
Your Output 
WEDNESDAY
Expected Output
WEDNESDAY
