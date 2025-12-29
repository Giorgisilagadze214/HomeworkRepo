import java.util.Scanner;
public class Task3 {
    static boolean palindrome(String x, int n, int y) {
        if (n >= y) {
            return true;
        }
        if (x.charAt(n) != x.charAt(y)) {
            return false;
        }
        return palindrome(x, n + 1, y - 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        if (palindrome(x, 0, x.length() - 1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}