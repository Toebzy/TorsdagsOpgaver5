package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer toby = new Customer("Tobias", "Carlsen", "tccarlsen");
        Customer simone = new Customer("Simone", "Heimmdal", "sheim12");
        Customer sigurt = new Customer("Sigurt", "Nøger", "Kalkmand2");
        Customer christian = new Customer("christian", "Kortsen", "Stevespicous");
        Customer joe = new Customer("Aoe", "Mahmer", "gotem23");
        Customer albert = new Customer("Albert", "Sørgensen", "Alsgørd");

        Customers.add(String.valueOf(toby));
        Customers.add(String.valueOf(simone));
        Customers.add(String.valueOf(sigurt));
        Customers.add(String.valueOf(christian));
        Customers.add(String.valueOf(joe));
        Customers.add(String.valueOf(albert));

        for(String Customers: Customers){
            System.out.println(Customers);
        }
    }
    static ArrayList<String> Customers = new ArrayList<String>();


}