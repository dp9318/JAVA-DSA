abstract class abstract_classes {
    int x=10;
    protected abstract int square(int a);
    protected abstract int cube(int a);
    protected abstract double squareroot(double a);
}

class calculate extends abstract_classes{
    protected int square(int a){
        return a*a;
    }
    protected int cube(int a){
        return a*a*a;
    }
    protected double squareroot(double a){
        return Math.sqrt((double)a);
    }
}


