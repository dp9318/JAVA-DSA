class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
    }

    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available: " + balance + ", Requested: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
    }
}

class Q19 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, 5000);

        try {
            account.deposit(2000);
            account.withdraw(8000);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            account.withdraw(-500);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

