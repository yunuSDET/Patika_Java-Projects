import java.util.Scanner;

public class Task_006_BodyMassIndex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters):");
        double height = input.nextDouble();

        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();

        double BMI = weight/(Math.pow(height,2));
        System.out.println("Your Body Mass Index (BMI) is: "+BMI);

    }
}
