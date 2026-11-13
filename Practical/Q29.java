class WorkerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running, count: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class WorkerRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " running, count: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Q29 {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        t1.setName("Thread-Class-Worker");

        Thread t2 = new Thread(new WorkerRunnable(), "Runnable-Worker");

        System.out.println("Thread 1 state before start: " + t1.getState());
        System.out.println("Thread 2 state before start: " + t2.getState());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread 1 state after completion: " + t1.getState());
        System.out.println("Thread 2 state after completion: " + t2.getState());
    }
}

