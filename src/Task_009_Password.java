import java.util.Scanner;

public class Task_009_Password {

    public static void main(String[] args) {





        String userName,password,actualPassword="hardPassword";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter user name:");
        userName=input.next();

        System.out.print("Enter password:");
        password=input.next();



        if(password.equals(actualPassword)){
            System.out.println("Login successful");
        }else{


                System.out.print("Do you want to change your password? (Y/N)");
                String answer = input.next();

                 input.nextLine();

                if(answer.equalsIgnoreCase("y")){

                    while (true){
                        System.out.print("Enter new password: ");
                        String newPassword =input.nextLine().trim();
                        if(newPassword.equals(actualPassword)){
                            System.out.println("Password should not match with last three ones");
                        }else if(newPassword.isEmpty()){
                            System.out.println("Password should not be empty");
                        }else{
                            System.out.println("Your password is changed");
                            break;
                        }
                    }

                }else{
                    System.out.println("Your password should be changed");
                }


        }



    }


}
