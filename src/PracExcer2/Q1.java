package PracExcer2;

//Creating a thread by extending the Thread class
class MyThread extends Thread {
 public void run() {
     System.out.println("Thread created by extending Thread class");
 }
}

//Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Thread created by implementing Runnable interface");
 }
}

public class Q1 {
 public static void main(String[] args) {
     // Creating a thread by extending the Thread class
     MyThread t1 = new MyThread();
     t1.start();

     // Creating a thread by implementing the Runnable interface
     MyRunnable r = new MyRunnable();
     Thread t2 = new Thread(r);
     t2.start();
 }
}

