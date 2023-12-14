import java.util.Scanner;

public class Task_008_Calculator {



    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n1,n2,select;

        System.out.println("Input first number: ");
        n1= input.nextInt();

        System.out.println("Input second number: ");
        n2=input.nextInt();

        System.out.println("Choose one option:\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        select=input.nextInt();

        String result ="";


        switch (select){

            case 1:
                result="The result of "+n1+"+"+n2+" is "+(n1+n2);
                break;
            case 2:
                result="The result of "+n1+"-"+n2+" is "+(n1-n2);
                break;
            case 3:
                result="The result of "+n1+"x"+n2+" is "+(n1*n2);
                break;
            case 4:
                result=n2==0 ? "Division with zero is not valid":"The result of "+n1+":"+n2+" is "+(n1/n2);
                break;

            default:
                result="Invalid input, please enter a number in range 1-4";
        }

        System.out.println(result);

    }

}
