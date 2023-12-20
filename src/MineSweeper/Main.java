package MineSweeper;

public class Main {

    public static void main(String[] args) {

        int a=4;
        System.out.print((a >> 1)+(a << 2) );


        MineSweeper mineSweeper=new MineSweeper(5,5);
        mineSweeper.run();

    }
}
