import java.util.Scanner;

public class Task_026_BankATM {
    public static Scanner input =new Scanner(System.in);
    public static double balance=5000;

    public static void main(String[] args) {


        String userName="user";
        String password="password";


        int right=3;

        while (right>0){

            System.out.println("Enter user name: ");
            String enteredUserName=input.nextLine();

            System.out.println("Enter password: ");
            String enteredPassword = input.nextLine();

            if(userName.equals(enteredUserName) && password.equals(enteredPassword)){
                System.out.println("Login successful.");
                userLoggedIn();
                break;

            }else{
                right--;
                System.out.println("Invalid user name or password.  You have "+right+" more right.");

            }



        }

        if(right==0){
            throw new RuntimeException("Your account is suspended");
        }else{
            System.out.println("Thanks for using.");
        }






    }


    public static void userLoggedIn(){

        String menu="""
                    Choose an option
                1)Withdrawal
                2)Deposit
                3)Checking the balance
                4)Log out""";

        boolean quit=false;
        while (!quit){
            System.out.println(menu);
            int chose = input.nextInt();

            switch (chose){
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    showBalance();
                    break;
                case 4:
                    quit=true;
                default:
                    System.out.println("Invalid value");
            }


        }


    }


    public static void withdraw(){
        System.out.println("Enter the amount: ");
        double amount=input.nextDouble();
        if(balance>=amount) balance-=amount;
    }


    public static void deposit(){
        System.out.println("Enter the amount: ");
        double amount=input.nextDouble();
        balance+=amount;
    }


    public static void showBalance(){
        System.out.println("Balance is "+balance);
    }


}
