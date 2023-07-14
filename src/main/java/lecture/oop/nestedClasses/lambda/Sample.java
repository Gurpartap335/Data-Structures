package lecture.oop.nestedClasses.lambda;

public class Sample  {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });
        th.start();
    }
}
