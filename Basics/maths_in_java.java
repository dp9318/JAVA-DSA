public class maths_in_java {
    public static void main(String[] args) {
        //max of 2 numbers
        int max_5_10 = Math.max(5,10);

        int min_5_10 = Math.min(5,10);

        double squareroot_64 = Math.sqrt(64); // this gives a double type of data

        double absolute_positive = Math.abs(-4.10); 

        double power = Math.pow(2,8);

        // Roundof, ceiling and floor function

        long round = Math.round(6.43232);

        double ceiling = Math.ceil(4.6);

        double floor = Math.floor(4.6);

        System.out.println(
            "max(5,10) : " + max_5_10 +
            "\nmin(5,10) : " + min_5_10 + 
            "\nsquareroot(64) : " + squareroot_64 + 
            "\npositive(-4.10) : " + absolute_positive + 
            "\npower(2^8) : " + power + 
            "\nround of(6.43232) : " + round + 
            "\nceiling function(4.6) : " + ceiling + 
            "\nfloor function(4.6) : " + floor
        );

        // Random in Java

        //random bydefault returns double but we can surely typecast it

        double randInt = Math.random(); //by default it will take between 0(inclusive) and 1(exclusive)

        double randInt2 = Math.random()*101; // it gives a number between 0(inclusive) and 101(exclusive), meaning 0-100

        System.out.println(randInt);
        System.out.println(randInt2);
    }
}
