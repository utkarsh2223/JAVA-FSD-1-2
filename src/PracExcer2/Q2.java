package PracExcer2;

public class Q2 {
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(this) {
                    try {
                        System.out.println("Thread 1 is going to sleep for 2 seconds");
                        Thread.sleep(2000);
                        System.out.println("Thread 1 woke up from sleep");
                        notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(this) {
                    try {
                        System.out.println("Thread 2 is waiting");
                        wait();
                        System.out.println("Thread 2 is done waiting");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        t1.start();
        t2.start();
    }
}
