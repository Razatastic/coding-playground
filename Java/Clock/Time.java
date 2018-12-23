import java.util.Random;

public class Time {
    private int hour, minute, second;

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toRegular() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
                (hour < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        Time currentTime = new Time();
        Random rand = new Random();
        int hr = rand.nextInt(24) + 1, min = rand.nextInt(60) + 1, sec = rand.nextInt(60) + 1;

        currentTime.setTime(hr, min, sec);
        System.out.println("Military Time: " + currentTime.toMilitary());
        System.out.println("Regular Time: " + currentTime.toRegular());
    }
}