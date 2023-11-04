package lecture.multithreading;

public class StoppableRunnable implements Runnable{

    private boolean stopRequested = false;

    public synchronized void requestStop() {
        this.stopRequested = true;
    }

    public synchronized boolean isStopRequested() {
        return this.stopRequested;
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        System.out.println("StoppableRunnable running");
        while ( !isStopRequested() ) {
            sleep(1000);
            System.out.println("....");
        }
        System.out.println("StoppableRunnable Stopped");
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread( stoppableRunnable, "YOOO");
        thread.start();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }
}
