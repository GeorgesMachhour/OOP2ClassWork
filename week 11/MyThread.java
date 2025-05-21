import java.lang.Thread;

public class MyThread extends Thread{ //public class MyThread implements Runnable {

    String name; 

    public MyThread(String name) {
        this.name = name; 
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) { 
            System.out.println("hello from Thread: " + name + " iteration: " + i); // Print the thread's name and the current iteration
        }
        System.out.println("Hello from a thread: " + name); // Print a message with the thread's name
    }

    public static void main(String[] args) {
        MyThread th1 = new MyThread("Th1"); // Create a new thread instance with a name
        MyThread th2 = new MyThread("Th2"); // Create another thread instance with a name
        MyThread th3 = new MyThread("Th3"); // Create yet another thread instance with a name

        // Thread t1 = new Thread(th1); for Runnable implementation
        // Thread t2 = new Thread(th2); 
        // Thread t3 = new Thread(th3); 

        th1.start(); // Start the first thread  
        th2.start(); // Start the second thread
        th3.start(); // Start the third thread
    }

}