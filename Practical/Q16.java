class Bank {
    double interest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double interest() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double interest() {
        return 7.5;
    }
}

class ICICI extends Bank {
    @Override
    double interest() {
        return 7.25;
    }
}

class Q16 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI: " + b.interest());

        b = new HDFC();
        System.out.println("HDFC: " + b.interest());

        b = new ICICI();
        System.out.println("ICICI: " + b.interest());
    }
}