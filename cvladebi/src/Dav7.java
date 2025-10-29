public class Dav7 {
    public static void main(String[] args) {
        int second = 2665;
        int hour = 0;
        int minute = 0;
        if (second >= 3600) {
            hour = second / 3600;
            second = second % 3600;
        }
        if (second >= 60) {
            minute = second / 60;
            second = second % 60;
        }
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
