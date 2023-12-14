import java.util.Scanner;

public class Task_003_Hypotenuse {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the length of the first vertical side");
        double first = input.nextDouble();

        System.out.println("Enter the length of the second vertical side");
        double second = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(first,2)+Math.pow(second,2));

        System.out.println("Hypotenuse is: "+hypotenuse);


        System.out.println("-".repeat(50));

        System.out.println("Calculating the area of a triangle");

        System.out.println("Enter the length of first side :");
        double firstSide = input.nextDouble();

        System.out.println("Enter the length of second side :");
        double secondSide = input.nextDouble();


        System.out.println("Enter the length of third side :");
        double thirdSide = input.nextDouble();

        double perimeter =firstSide+secondSide+thirdSide;

        double u = perimeter/2;

        double area =Math.sqrt(u*(u-firstSide)*(u-secondSide)*(u-thirdSide));

        System.out.println("The area of the triangle: "+area);



    }
}
