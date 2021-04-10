package Thread.Activity13;

public class Program {
    public static int year;
    public static boolean flag = false;
    public static int sleep = 2000;

    public static void main(String[] args) {
        ThreadYear getYear = new ThreadYear();
        CheckYear checkYear = new CheckYear();
        getYear.start();
        checkYear.start();
    }
}
