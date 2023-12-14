import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Input the radius for the circle: ");
        double radius = input.nextDouble();
        double PI = 3.14;

        double area = PI*Math.pow(radius,2);
        double perimeter= 2*PI*radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
