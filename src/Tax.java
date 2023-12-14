import java.util.Scanner;

public class Tax {


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Input the amount :");
        double amount = input.nextDouble();

        if(amount<=0) throw new RuntimeException("Input a valid value");

        double taxRate =amount<=1000 ? 0.18 : 0.08;

        System.out.println("Amount without the tax: "+amount);
        System.out.println("Amount with the tax: "+(amount+(amount*taxRate)));
        System.out.println("Amount of the tax: "+(amount*taxRate));


    }


}
