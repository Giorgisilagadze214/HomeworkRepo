import java.util.Scanner;
public class Task6 {
    static String restore(String x, int n) {
        if (n == x.length() - 1) {
            return "" + x.charAt(n);
        }
        if (x.charAt(n) == x.charAt(n + 1)) {
            return restore(x, n + 1);
        }
        return x.charAt(n) + restore(x, n + 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        System.out.println(restore(x, 0));
    }
}
