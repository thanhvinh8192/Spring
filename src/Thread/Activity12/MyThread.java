package Thread.Activity12;

public class MyThread extends Thread {
    private String name;
    private int sleep;

    public MyThread(String name, int sleep) {
        this.name = name;
        this.setName(name);
        this.sleep = sleep;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(System.currentTimeMillis() + ": Thread " + name);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
