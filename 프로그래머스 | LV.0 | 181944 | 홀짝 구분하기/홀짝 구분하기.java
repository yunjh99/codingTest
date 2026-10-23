import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int s = new Scanner(System.in).nextInt();

        System.out.print(s + (s % 2 == 0 ? " is even" : " is odd"));
    }
}