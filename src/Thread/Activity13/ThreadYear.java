package Thread.Activity13;

import java.util.Random;

public class ThreadYear extends Thread {
    @Override
    public void run() {
       if(!Program.flag){
           while (true){
               Random r = new Random();
               Program.year = r.nextInt(999) + 1000;
               System.out.println(Thread.currentThread().getName() + " Get year number: " + Program.year);
               Program.flag = true;
               try {
                   Thread.sleep(Program.sleep);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
    }
}
