package Thread.Activity14;

import java.util.HashMap;
import java.util.Map;

public class Activity14 {

    public static Map<String, String> map = new HashMap<String, String>();
    public static String randomKey = "";
    public static boolean flag = false;

    public static void main(String[] args) {
        map.put("Monday", "Thứ 2");
        map.put("Tuesday", "Thứ 3");
        map.put("Wednesday", "Thứ 4");
        map.put("Thursday", "Thứ 5");
        map.put("Friday", "Thứ 6");
        map.put("Saturday", "Thứ 7");
        map.put("Sunday", "Chủ nhật");

        Thread thread1 = new ThreadGetDayOfWeek();
        Thread thread2 = new ThreadGetValueToWeek();
        thread1.start();
        thread2.start();
    }
}
