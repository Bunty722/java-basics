class SharedObject {
    public synchronized void produce() {
        System.out.println("Producer is producing...");
        
        try {
            // Wait for the consumer to consume
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Producer resumed production.");
    }
    
    public synchronized void consume() {
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Consumer is consuming...");
        
        // Notify the producer to resume
        notify();
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        
        Thread producerThread = new Thread(() -> sharedObject.produce());
        Thread consumerThread = new Thread(() -> sharedObject.consume());
        
        producerThread.start();
        consumerThread.start();
    }
}
