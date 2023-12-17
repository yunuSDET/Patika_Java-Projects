import java.util.Scanner;

public class Task_014_FlightTicketPrice {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        double pricePerKm =0.10;


        System.out.println("Enter distance in km: ");
        double distance = input.nextDouble();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter the type of journey (1 => One Way, 2 => Round Trip)");
        int typeOfJourney= input.nextInt();

        double totalPrice=distance*pricePerKm;


        if(distance<=0 || age<=0 ||(typeOfJourney<1 || typeOfJourney>2)) {
            System.out.println("Invalid value");
            return;
        }


        if(age<12){
            totalPrice*=0.5;
        } else if(age<=24){
            totalPrice*=0.9;
        } else if(age>65){
            totalPrice*=0.7;
        }

        if(typeOfJourney==2) {
            totalPrice*=0.8;
            totalPrice*=2;
        }

        System.out.println("Total amount is :"+totalPrice+" ₺");







    }
}
