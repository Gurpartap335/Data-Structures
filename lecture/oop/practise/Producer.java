package lecture.oop.practise;

// https://www.geeksforgeeks.org/message-passing-in-java/

import java.util.Vector;

/**
 * Message passing in terms of computers is communication between processes.
 */
public class Producer extends Thread{
    static final int MAX = 7;

    private Vector messages = new Vector<>();

    @Override
    public void run() {
        try {
            while (true) {
                putMessage();
                sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }

    private synchronized void putMessage() throws InterruptedException{
        while (messages.size() == MAX) {
            wait();
        }

        messages.addElement(new java.util.Date().toString());
        notify();
    }

    public synchronized String getMessage() throws InterruptedException{
        notify();
        while (messages.size() == 0)
            wait();
            String message = (String)messages.firstElement();
            messages.removeElement(message);
            return message;

    }

    class Consumer extends Thread {
        Producer producer;
        Consumer(Producer p) {
            producer = p;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String message = producer.getMessage();
                    System.out.println("Got message: " + message);
                    sleep(2000);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.start();
    }
}
