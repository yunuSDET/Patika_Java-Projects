public class Task_044_PrintB {

    public static void main(String[] args) {
        int size = 5;


        char[][] pattern = new char[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1 || i == size / 2) {

                    pattern[i][j] = 'B';
                } else {

                    pattern[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
