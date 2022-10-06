package Task1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Driver Tony = new Driver("Tobias", 21);
        Car Polo = new Car("Volkswagen", "Polo Classic", 1996, "Sports Car", Driver.getName);
        Car Lambo = new Car("Lamborghini", "SC18", 2019, "Sports Car", Driver.getName);

        System.out.print(Polo);
        System.out.println(Tony);
        System.out.print(Lambo);
        System.out.print(Tony);

    }

}