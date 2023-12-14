import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_007_Greengrocer {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

      Map<String,Double> products = new HashMap<>();
      products.put("Apple",3.67);
      products.put("Tomato",1.11);
      products.put("Banana",0.95);
      products.put("Eggplant",5.00);
      products.put("Pear",2.14);
        double sum = 0;

        for (Map.Entry<String, Double> eachEntry : products.entrySet()) {

            System.out.println("Please enter the weight  (kg) of "+eachEntry.getKey()+": ");
            double eachKg = input.nextDouble();
            sum+=eachKg*eachEntry.getValue();
        }

        System.out.println("Total amount is: "+sum+" ₺");


    }
}
