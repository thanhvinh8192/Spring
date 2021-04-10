package Thread.Activity11;

import java.util.ArrayList;
import java.util.List;

public class Activity11 {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        for(int i=1; i<=50; i++){
            Thread thread = new Thread(new ThreadActivity11(i));
            thread.setName("Thread-" + i);
            threadList.add(thread);
        }
        for (Thread th : threadList) {
            th.start();
        }

    }
}
