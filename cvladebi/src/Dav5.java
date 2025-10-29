public class Dav5 {
    public static void main(String[] args) {
        double x = 11.5;
        if (x - (int) x < 0.5) {
            x = (int) x;
        } else {
            x = (int) x + 1;
        }
        System.out.println(x);
    }
}
