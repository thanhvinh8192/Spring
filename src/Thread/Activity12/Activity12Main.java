package Thread.Activity12;

public class Activity12Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("ABC", 3500);
        MyThread thread2 = new MyThread("DEF", 2500);
        thread1.start();
        thread2.start();
    }
}
