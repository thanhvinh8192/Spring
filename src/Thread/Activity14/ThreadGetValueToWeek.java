package Thread.Activity14;

public class ThreadGetValueToWeek extends Thread {
    @Override
    public void run() {
        while (true){
            if (Activity14.flag){
                String value = Activity14.map.get(Activity14.randomKey);
                System.out.println(value);
                Activity14.flag = false;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
