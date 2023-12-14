import java.util.Scanner;

public class Task_004_Taximeter {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double startingAmount = 10;
        double valueOfTaximeterForPerKm = 2.20;
        double minimumValue = 20;

        double km = 150;

        double amount = startingAmount + valueOfTaximeterForPerKm*km;

        if(amount<minimumValue) amount=minimumValue;

        System.out.println("The amount for "+km+" km is :"+amount);



    }
}
