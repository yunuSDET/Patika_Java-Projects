import java.util.Scanner;

public class Task_027_LCM_GCD {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber=input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber=input.nextInt();

        System.out.println("LCM is: "+getLCM(firstNumber,secondNumber));

        System.out.println("GCD is: "+getGCD(firstNumber,secondNumber));


    }



    public static int getLCM(int number1,int number2){

        int LCM =Math.max(number1,number2);
        while (LCM <=number1*number2){
            if(LCM % number1 == 0 && LCM % number2 == 0) return LCM;
            LCM++;
        }
        return -1;
    }

    public static int getGCD(int number1,int number2){

        int GCD =Math.min(number1,number2);
        while (GCD >=1){
            if(number1 % GCD == 0 && number2 % GCD == 0) return GCD;
            GCD--;
        }
        return -1;
    }




}
