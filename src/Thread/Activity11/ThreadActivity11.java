package Thread.Activity11;

public class ThreadActivity11 extends Thread {
    int STT;
    public ThreadActivity11(int STT) {
        this.STT = STT;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":  STT= " + STT);
    }
}
