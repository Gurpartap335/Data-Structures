package lecture.core.oop.nestedClasses;

//
public class MultiThreading extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private int threadNumber;
    public MultiThreading (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public static void main(String[] args) {
//        MultiThreading th = new MultiThreading();
//        th.start();
//
//        MultiThreading th2 = new MultiThreading();
//        th2.start();
//
//        MultiThreading th3 = new MultiThreading();
//        th3.start();

        for (int i = 0; i <= 3; i++) {
            MultiThreading th = new MultiThreading(i);
            th.start();
        }
    }
}
