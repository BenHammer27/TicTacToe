package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "_________";

        char[] array = line.toCharArray();


        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println("---------");

        boolean status = true;

        int counter = 0;

        do {

            boolean statusCell = true;
            int next = 0;
            do {
                System.out.println("Enter the coordinates");
                String cell = scanner.nextLine();

                if(cell.equals("1 1")) {
                    next = 6;
                    statusCell = false;
                } else if(cell.equals("1 2")) {
                    next = 3;
                    statusCell = false;
                } else if(cell.equals("1 3")) {
                    next = 0;
                    statusCell = false;
                } else if(cell.equals("2 1")) {
                    next = 7;
                    statusCell = false;
                } else if(cell.equals("2 2")) {
                    next = 4;
                    statusCell = false;
                } else if(cell.equals("2 3")) {
                    next = 1;
                    statusCell = false;
                } else if(cell.equals("3 1")) {
                    next = 8;
                    statusCell = false;
                } else if(cell.equals("3 2")) {
                    next = 5;
                    statusCell = false;
                } else if(cell.equals("3 3")) {
                    next = 2;
                    statusCell = false;
                }
            } while(statusCell);


            if (array[next] != '_') {
                System.out.println("This cell is occupied. Choose another one!");
                status = true;
            } else {
                if (counter % 2 != 0) {
                    array[next] = 'O';
                } else {
                    array[next] = 'X';
                }
            }

            System.out.println("---------");
            System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
            System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
            System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
            System.out.println("---------");

            counter++;

            boolean xWins = false;
            if (array[0]== 'X' && array[4] == 'X' && array[8] == 'X') {
                xWins = true;
            } else if (array[2] == 'X' && array[4] == 'X' && array[6] == 'X') {
                xWins = true;
            } else if (array[0] == 'X' && array[1] == 'X' && array[2] == 'X') {
                xWins = true;
            } else if (array[3] == 'X' && array[4] == 'X' && array[5] == 'X') {
                xWins = true;
            } else if (array[6] == 'X' && array[7] == 'X' && array[8] == 'X') {
                xWins = true;
            } else if (array[0] == 'X' && array[3] == 'X' && array[6] == 'X') {
                xWins = true;
            } else if (array[1] == 'X' && array[4] == 'X' && array[7] == 'X') {
                xWins = true;
            } else if (array[2] == 'X' && array[5] == 'X' && array[8] == 'X') {
                xWins = true;
            }
            //System.out.println(xWins);

            boolean oWins = false;
            if (array[0]== 'O' && array[4] == 'O' && array[8] == 'O') {
                oWins = true;
            } else if (array[2] == 'O' && array[4] == 'O' && array[6] == 'O') {
                oWins = true;
            } else if (array[0] == 'O' && array[1] == 'O' && array[2] == 'O') {
                oWins = true;
            } else if (array[3] == 'O' && array[4] == 'O' && array[5] == 'O') {
                oWins = true;
            } else if (array[6] == 'O' && array[7] == 'O' && array[8] == 'O') {
                oWins = true;
            } else if (array[0] == 'O' && array[3] == 'O' && array[6] == 'O') {
                oWins = true;
            } else if (array[1] == 'O' && array[4] == 'O' && array[7] == 'O') {
                oWins = true;
            } else if (array[2] == 'O' && array[5] == 'O' && array[8] == 'O') {
                oWins = true;
            }
            //System.out.println(oWins);

            int countOfX = 0;
            int countOfO = 0;
            int countOfEmptyCells = 0;

            for (int i = 0; i < array.length; i++){
                if (array[i] == 'X'){
                    countOfX++;
                } else if (array[i] == 'O'){
                    countOfO++;
                } else {
                    countOfEmptyCells++;
                }
            }

            //System.out.println(countOfX + " " + countOfO + " " + countOfEmptyCells);

            if (xWins && !oWins) {
                System.out.println("X wins");
                status = false;
            } else if (oWins && !xWins) {
                System.out.println("O wins");
                status = false;
            } else if (!xWins && !oWins && countOfEmptyCells == 0) {
                System.out.println("Draw");
                status = false;
            }

        } while(status);




        //char[] ch = line.toCharArray();

        /*int countOfX = 0;
        int countOfO = 0;
        int countOfEmptyCells = 0;

        for (int i = 0; i < ch.length; i++){
            if (ch[i] == 'X'){
                countOfX++;
            } else if (ch[i] == 'O'){
                countOfO++;
            } else {
                countOfEmptyCells++;
            }
        }
        int difference = Math.abs(countOfX-countOfO);

        */
    }
}

        //System.out.println(countX + " " + countO + " " + countBlank);

        /*System.out.println("---------");
        System.out.println("| " + cA[0] + " " + cA[1] + " " + cA[2] + " |");
        System.out.println("| " + cA[3] + " " + cA[4] + " " + cA[5] + " |");
        System.out.println("| " + cA[6] + " " + cA[7] + " " + cA[8] + " |");
        System.out.println("---------");



        System.out.println("---------");
        System.out.println("| " + cA[0] + " " + cA[1] + " " + cA[2] + " |");
        System.out.println("| " + cA[3] + " " + cA[4] + " " + cA[5] + " |");
        System.out.println("| " + cA[6] + " " + cA[7] + " " + cA[8] + " |");
        System.out.println("---------");



        /*boolean xWins = false;
        boolean oWins = false;
        boolean possible = true;

        if(countX > countO + 1 || countO > countX+1){
            possible = false;
        }

        if(cA[0] == 'X' && cA[1] == 'X' && cA[2] == 'X'){
            xWins = true;
        } else if(cA[3] == 'X' && cA[4] == 'X' && cA[5] == 'X'){
            xWins = true;
        } else if(cA[6] == 'X' && cA[7] == 'X' && cA[8] == 'X'){
            xWins = true;
        } else if(cA[0] == 'X' && cA[3] == 'X' && cA[6] == 'X'){
            xWins = true;
        } else if(cA[1] == 'X' && cA[4] == 'X' && cA[7] == 'X') {
            xWins = true;
        } else if(cA[2] == 'X' && cA[5] == 'X' && cA[8] == 'X') {
            xWins = true;
        } else if(cA[0] == 'X' && cA[4] == 'X' && cA[8] == 'X') {
            xWins = true;
        } else if(cA[6] == 'X' && cA[4] == 'X' && cA[2] == 'X') {
            xWins = true;
        }

        if(cA[0] == 'O' && cA[1] == 'O' && cA[2] == 'O'){
            oWins = true;
        } else if(cA[3] == 'O' && cA[4] == 'O' && cA[5] == 'O'){
            oWins = true;
        } else if(cA[6] == 'O' && cA[7] == 'O' && cA[8] == 'O'){
            oWins = true;
        } else if(cA[0] == 'O' && cA[3] == 'O' && cA[6] == 'O'){
            oWins = true;
        } else if(cA[1] == 'O' && cA[4] == 'O' && cA[7] == 'O') {
            oWins = true;
        } else if(cA[2] == 'O' && cA[5] == 'O' && cA[8] == 'O') {
            oWins = true;
        } else if(cA[0] == 'O' && cA[4] == 'O' && cA[8] == 'O') {
            oWins = true;
        } else if(cA[6] == 'O' && cA[4] == 'O' && cA[2] == 'O') {
            oWins = true;
        }

        //System.out.println(possible + " " + xWins + " " + oWins);

        if(possible && !xWins && !oWins && countBlank > 0){
            System.out.println("Game not finished");
        } else if(possible && !xWins && !oWins){
            System.out.println("Draw");
        } else if(possible && xWins && !oWins){
            System.out.println("X wins");
        } else if(possible && !xWins && oWins){
            System.out.println("O wins");
        } else {
            System.out.println("Impossible");
        }

        else if (xWins && oWins || difference >= 2) {

                System.out.println("Impossible");
            } else if (!xWins && !oWins && countOfEmptyCells > 0) {
                System.out.println("Game not finished");
            } */
