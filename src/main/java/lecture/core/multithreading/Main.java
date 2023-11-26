package lecture.core.multithreading;

// https://medium.com/excited-developers/java-multithreading-all-you-need-to-know-33d7e0ff4622

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable running");
//                System.out.println("Runnable finished");
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        Runnable runnable1 = () -> {
//            System.out.println("Hello");
//        };
//
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();
//
//        String name = Thread.currentThread().getName();
//        System.out.println(name) ;
//        System.out.println(name);


        ThreadRun threadRun = new ThreadRun();
        threadRun.run();

        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running");
        };

        Thread carti = new Thread(runnable, "Carti");
        carti.start();

        Thread ye = new Thread(runnable, "Kanye");
        ye.start();

        Thread yeat = new Thread(runnable, "yeat");
        Thread.sleep(1000);
        yeat.start();

        Thread uzi = new Thread(runnable, "Uzi");
        uzi.start();




    }

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    static class ThreadRun implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }






}




/**
 * Thread
 * Runnable interface
 *
 * CPU(central processing unit) -> operating system
 * Multithreading -> threads with multiple tasks
 * why multithreading -> Better cpu utilization
 */

/**
 * Difference between outside class and class defined inside class.
 * multithreading project -> downloading images
 */