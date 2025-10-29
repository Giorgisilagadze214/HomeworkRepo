public class Dav8 {
    public static void main(String[] args) {
        int second = 2665;
        int hour = second / 3600;
        int minute = (second % 3600) / 60;
        second = second % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
