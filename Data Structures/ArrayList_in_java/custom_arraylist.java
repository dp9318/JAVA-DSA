import java.util.ArrayList;

public class custom_arraylist {
    public static void main(String[] args) {

        ArrayList<cars> car = new ArrayList<>();

        car.add(new cars("BMW", "M4gt", 2014));
        car.add(new cars("Toyota", "Supra MK4", 1998));
        car.add(new cars("Mitshubishi", "Land EVO", 2008));
        car.add(new cars("Pagani", "Zonda R", 2019));
        car.add(new cars("Honda", "Civic", 2012));
        System.out.println(car);
    }
}

