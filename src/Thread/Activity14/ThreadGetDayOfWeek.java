package Thread.Activity14;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ThreadGetDayOfWeek extends Thread {
    @Override
    public void run() {
        Random r = new Random();
        Object[] key = Activity14.map.keySet().toArray();
        while (true){
            Activity14.randomKey = key[r.nextInt(key.length)].toString();
            System.out.println(Activity14.randomKey);
            Activity14.flag = true;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
