package MineSweeper;

import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rowNumber;
    private int columnNumber;
    private int totalMines;
    private String[][] area;
    private String[][] showArea;

    Scanner input=new Scanner(System.in);

    Random random=new Random();

    public void setRowNumber(int rowNumber) {
        if (rowNumber < 2) {
            throw new RuntimeException("Row number can not be less than 2");
        } else {
            this.rowNumber = rowNumber;
        }
    }

    public void setColumnNumber(int columnNumber) {
        if (rowNumber < 2) {
            throw new RuntimeException("Column number can not be less than 2");
        } else {
            this.columnNumber = columnNumber;
        }

    }

    public MineSweeper(int rowNumber, int columnNumber) {
        setRowNumber(rowNumber);
        setColumnNumber(columnNumber);
        totalMines = (int) Math.ceil(((double) rowNumber * columnNumber) / 4);
        area = new String[rowNumber][columnNumber];
        showArea=  new String[rowNumber][columnNumber];
        fill(area," - ");
        fill(showArea," - ");
        addMines();
    }

    public void fill(String[][] array, String value){

        for (int i = 0; i <rowNumber ; i++) {
            for (int j = 0; j < columnNumber; j++) {

                array[i][j]=value;


            }
        }
    }

    public void addMines(){


        int counter=0;

        while (counter!=totalMines){
            int randomRow=  random.nextInt(rowNumber);
            int randomColumn=  random.nextInt(columnNumber);
            if(!area[randomRow][randomColumn].equals(" * ")){
                area[randomRow][randomColumn]=" * ";
                counter++;
            }
        }

        for (int i = 0; i <rowNumber ; i++) {
            for (int j = 0; j < columnNumber; j++) {
                if(!area[i][j].equals(" * ")){
                    area[i][j]=" - ";
                    counter++;
                }
            }
        }

    }



    public void print(String[][] array){
        for (int i = 0; i <rowNumber ; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }





    public void run() {

        print(area);
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        System.out.println();
        print(showArea);

        boolean quit=false;


        while (!quit){
            System.out.println("Enter row number to select: ");
            int enteredRow=input.nextInt();

            System.out.println("Enter column number to select: ");
            int enteredColumn=input.nextInt();

            String value=area[enteredRow][enteredColumn];
            String valueShow=area[enteredRow][enteredColumn];
            if(value.equals(" * ")) {
                System.out.println("You failed!");
                quit=true;
            }else if (!valueShow.equals(" - ")) {
                System.out.println("This cell was already chosen.");
            }else{
                showArea[enteredRow][enteredColumn]=" "+findMines(enteredRow,enteredColumn)+" ";
                print(showArea);
            }


        }



    }

    public int findMines(int rowN,int columnN){
        int counter=0;


        if(columnN<columnNumber-1 && area[rowN][columnN+1].equals(" * ")){
            counter++;
        }

        if(columnN<columnNumber-1 && rowN>0  && area[rowN-1][columnN+1].equals(" * ")){
            counter++;
        }

        if(rowN>0  && area[rowN-1][columnN].equals(" * ")){
            counter++;
        }

        if(columnN>0 && rowN>0  && area[rowN-1][columnN-1].equals(" * ")){
            counter++;
        }

        if(columnN>0 &&  area[rowN][columnN-1].equals(" * ")){
            counter++;
        }

        if(columnN>0 &&  rowN<rowNumber-1 && area[rowN+1][columnN-1].equals(" * ")){
            counter++;
        }

        if(rowN<rowNumber-1 && area[rowN+1][columnN].equals(" * ")){
            counter++;
        }

        if(rowN<rowNumber-1 && columnN<columnNumber-1 && area[rowN+1][columnN+1].equals(" * ")){
            counter++;
        }
        return counter;
    }


}
