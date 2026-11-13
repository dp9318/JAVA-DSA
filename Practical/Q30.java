class JointAccount {
    private int balance = 1000;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " failed withdrawal: Insufficient balance (" + balance + ")");
            }
        }
    }

    int getBalance() {
        return balance;
    }
}

class TransactionTask implements Runnable {
    private JointAccount account;
    private boolean isDeposit;
    private int amount;

    TransactionTask(JointAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

class Q30 {
    public static void main(String[] args) {
        JointAccount account = new JointAccount();

        Thread user1 = new Thread(new TransactionTask(account, true, 500), "User-1");
        Thread user2 = new Thread(new TransactionTask(account, false, 700), "User-2");
        Thread user3 = new Thread(new TransactionTask(account, false, 600), "User-3");
        Thread user4 = new Thread(new TransactionTask(account, true, 400), "User-4");

        user1.start();
        user2.start();
        user3.start();
        user4.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Account Balance: " + account.getBalance());
    }
}

