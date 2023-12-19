public class Task_045_FindRepeatedEvenNumbers {

    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0,12,1,15,788};

        int[] duplicated =new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int counter=0;
            for (int j = 0; j < list.length; j++) {
                if(list[i]==list[j]) counter++;
            }
            if (counter>1 && (list[i] % 2 ==0)) System.out.println(list[i]);
        }




    }


}
