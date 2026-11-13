@FunctionalInterface
interface BinaryOperation {
    double apply(double a, double b);
}

@FunctionalInterface
interface UnaryOperation {
    double apply(double a);
}

class Q18 {
    public static void main(String[] args) {
        BinaryOperation add = (a, b) -> a + b;
        BinaryOperation sub = (a, b) -> a - b;
        BinaryOperation mul = (a, b) -> a * b;
        BinaryOperation div = (a, b) -> a / b;
        BinaryOperation pow = (a, b) -> Math.pow(a, b);

        UnaryOperation sqrt = a -> Math.sqrt(a);
        UnaryOperation sin = a -> Math.sin(Math.toRadians(a));
        UnaryOperation log = a -> Math.log(a);

        double x = 16, y = 4;

        System.out.println("Addition: " + add.apply(x, y));
        System.out.println("Subtraction: " + sub.apply(x, y));
        System.out.println("Multiplication: " + mul.apply(x, y));
        System.out.println("Division: " + div.apply(x, y));
        System.out.println("Power: " + pow.apply(x, y));
        System.out.println("Square Root: " + sqrt.apply(x));
        System.out.println("Sin(30): " + sin.apply(30));
        System.out.println("Natural Log: " + log.apply(x));
    }
}

