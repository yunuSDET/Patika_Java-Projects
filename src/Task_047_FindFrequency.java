public class Task_047_FindFrequency {

    public static void main(String[] args) {

        int[] array={10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < array.length; i++) {

            int counter=0;
            int counterBeforeActual=0;
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j]){
                    counter++;
                    if(j<i) counterBeforeActual++;
                }
            }
            if(counterBeforeActual==0){
                System.out.println(array[i]+" is repeated "+counter+ (counter==1 ? " time.":" times."));
            }

        }


    }



}
