import java.util.Scanner;

public class Task_034_Calculator2 {

    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {

start();




    }


    public static void start(){
        String menu= """
                Choose an option:
                1- Additional
                2- Subtraction
                3- Multiplication
                4- Division
                5- Power
                6- Factorial
                7- Remainder
                8- Perimeter
                9- Area
                0- Close
                """;
        boolean quit=false;
        while (!quit){
            System.out.println(menu);
            int chose=input.nextInt();

            switch (chose){
                case 1:
                    System.out.println(additional());;
                    break;
                case 2:
                    System.out.println(subtraction());;
                    break;
                case 3:
                    System.out.println(multiplication());;
                    break;
                case 4:
                    System.out.println(division());;
                    break;
                case 5:
                    System.out.println(power());;
                    break;
                case 6:
                    System.out.println(factorial());;
                    break;
                case 7:
                    System.out.println(remainder());;
                    break;
                case 8:
                    System.out.println(perimeter());;
                    break;
                case 9:
                    System.out.println(area());;
                    break;
                case 0:
                    quit=true;
                    System.out.println("Thanks for using.");
                    break;
                default:
                    System.out.println("Invalid input.");
            }



        }


    }

    public static int additional(){
        System.out.println("Enter first number: ");
        int n1=input.nextInt();
        System.out.println("Enter second number: ");
        int n2=input.nextInt();
        return n1+n2;
    }

    public static int subtraction(){
        System.out.println("Enter first number: ");
        int n1=input.nextInt();
        System.out.println("Enter second number: ");
        int n2=input.nextInt();
        return n1-n2;
    }

    public static int multiplication(){
        System.out.println("Enter first number: ");
        int n1=input.nextInt();
        System.out.println("Enter second number: ");
        int n2=input.nextInt();

        return n1*n2;
    }

    public static double division(){
        System.out.println("Enter first number: ");
        int n1=input.nextInt();
        System.out.println("Enter second number: ");
        int n2=input.nextInt();
        if(n2==0) {
            throw new RuntimeException("The error of division by zero");
        };
        return ((double)n1)/n2;
    }

    public static int power(){

        System.out.println("Enter the number: ");
        double n1=input.nextDouble();
        System.out.println("Enter the power: ");
        double n2=input.nextDouble();

        return (int)Math.pow(n1,n2);
    }


    public static int factorial(){
        System.out.println("Enter the number: ");
        double n1=input.nextDouble();
        if(n1<0){
            return -1;
        }else if(n1<1){
            return 1;
        }
        int factorial=1;
        for (int i = 1; i <=n1 ; i++) {
           factorial*=i;
        }
    return factorial;

    }

    public static int remainder(){
        System.out.println("Enter the number: ");
        int n1=input.nextInt();
        System.out.println("Enter the divisor: ");
        int n2=input.nextInt();
        if(n2==0) {
            throw new RuntimeException("The error of division by zero");
        };
        return n1 % n2;
    }

    public static int perimeter(){
        System.out.println("Enter short side length: ");
        int n1=input.nextInt();
        System.out.println("Enter long side length: ");
        int n2=input.nextInt();
        return (n1+n2)*2;
    }

    public static int area(){
        System.out.println("Enter short side length: ");
        int n1=input.nextInt();
        System.out.println("Enter long side length: ");
        int n2=input.nextInt();
        return n1*n2;
    }

}
