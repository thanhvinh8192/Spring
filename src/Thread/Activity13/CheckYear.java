package Thread.Activity13;

public class CheckYear extends Thread {
    @Override
    public void run() {
        while (true){
            if(Program.flag){
                if (Program.year%4 == 0 && Program.year%100 != 0){
                    System.out.println(Thread.currentThread().getName() + ": Nam " + Program.year + " la nam nhuan");
                }
                else {
                    System.out.println(Thread.currentThread().getName() + "Nam " + Program.year + " khong la nam nhuan");
                }
                Program.flag = false;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
